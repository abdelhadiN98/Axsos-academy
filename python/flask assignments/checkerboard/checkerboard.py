from flask import Flask,render_template
app = Flask(__name__)    

@app.route('/')
def cheacker():
    return render_template("checkerboard.html")

@app.route('/<num>')
def change_row(num):
    number=int(num)/2
    return render_template("checkboard2.html", number=int(number))

@app.route('/<num1>/<num2>')
def colors(num1,num2):
    number2=int(num1)/2
    number3=int(num2)/2
    return render_template("checkboard3.html",number2=int(number2),number3=int(number3))

@app.route('/<num3>/<num4>/<color1>/<color2>')
def color_num(num3,num4,color1,color2):
    number4=int(num3)/2
    number5=int(num4)/2
    return render_template("checkboard4.html",number4=int(number4),number5=int(number5),color1=color1,color2=color2)
if __name__=="__main__":       
    app.run(debug=True)