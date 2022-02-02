from flask import Flask,render_template
import random
app = Flask(__name__)

@app.route('/play')
def level1():
    return render_template("playGround.html")

@app.route('/play/<number>')
def level2(number):
        return render_template("level2.html",phrase="",number=int(number))

@app.route('/play/<number>/<color>')
def level3(number,color):
        return render_template("level3.html",phrase="",number=int(number),color=color)

if __name__=="__main__":   
    app.run(debug=True)