import express from 'express'
import ContatoRouter from './routes/ContatoRoute.js'

const app = express()
app.use(express.json())

app.use('/contato', ContatoRouter)

app.listen(3000, () => {console.log('API Rodando na porta 3000!')})