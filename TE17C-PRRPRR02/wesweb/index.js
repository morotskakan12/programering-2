const express = require('express')
const app = express()
const port = 3000

app.use(express.json())
app.use(express.urlencoded())

app.get('/', (req, res) => res.sendFile(__dirname + '\\start.html'))

app.get('/a', (req, res) => {
  res.sendFile(__dirname + '\\style.css')
})

app.get('/b', (req, res) => {
  res.sendFile(__dirname + '\\facepalmjesus.jpg')
})

app.post('/login', function (req, res) {
    console.log(req.body.text)
    res.send('Griet success comrad!')
})

app.listen(port, () => console.log(`Example app listening on port ${port}!`))