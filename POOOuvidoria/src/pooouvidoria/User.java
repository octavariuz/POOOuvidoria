package pooouvidoria;


public class User {
    private int ID;
    private String email, reclamacao, resposta, login;

    public User(int ID, String email, String reclamacao, String resposta, String login) {
        this.ID = ID;
        this.email = email;
        this.reclamacao = reclamacao;
        this.resposta = resposta;
        this.login = login;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReclamacao() {
        return reclamacao;
    }

    public void setReclamacao(String reclamacao) {
        this.reclamacao = reclamacao;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
}
