import express from 'express'
import ContatoController from '../controllers/ContatoController'

const ContatoRouter = express.Router()

ContatoRouter.get('/', ContatoController.list)
ContatoRouter.get('/:id', ContatoController.find)
//ContatoRouter.delete()

export default ContatoRouter