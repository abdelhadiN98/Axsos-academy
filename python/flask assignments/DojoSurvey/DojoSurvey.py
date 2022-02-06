from flask import Flask, redirect , render_template, request 

app = Flask(__name__)
@app.route("/" ,methods=['post'])
def index():
    return render_template("DojoSurvey.html")

@app.route("/process", methods=["POST"])
def process_form():
    print(request.form)
    print(f"username submitted:{request.form['username']}")
    print(f"Location submitted:{request.form['Location']}")
    print(f"Language submitted:{request.form['Languages']}")
    print(f"comment submitted:{request.form['comment']}")
    return render_template("DojoSurveyResult.html" , name=request.form["username"],loc=request.form["Location"] , 
    lan=request.form["Languages"] , com=request.form["comment"])

# @app.route("/back", methods=["POST"])
# def back():
#     return redirect("/")



if __name__ == "__main__":
    app.run(debug=True)