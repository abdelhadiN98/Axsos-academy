from flask import Flask

app = Flask(__name__)

@app.route('/')
def hello():
    return "Hello World!"

@app.route('/dojo')
def dojo():
    return "Dojo"

@app.route('/say/<name>')
def sayName(name):
    return f"Hi {name}"

@app.route('/repeat/<number>/<name>')
def repeat(number,name):
    return f"{name}" * int(number)

if __name__=="__main__":   
    app.run(debug=True)



