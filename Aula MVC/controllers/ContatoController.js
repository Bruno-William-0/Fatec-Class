import { getAll } from "../models/Contato.js"

class ContatoCOntroller {
    static list(req, res){
        res.json(getAll())
    }
}

export default ContatoController
    