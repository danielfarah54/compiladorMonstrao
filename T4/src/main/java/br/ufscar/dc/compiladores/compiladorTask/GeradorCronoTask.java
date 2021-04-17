package br.ufscar.dc.compiladores.compiladorTask;

import br.ufscar.dc.compiladores.compiladorTask.TabelaDeSimbolos.TarefaCategoria;

public class GeradorCronoTask extends TaskRulesBaseVisitor<Void> {

    StringBuilder saida;
    TabelaDeSimbolos tabela;

    public GeradorCronoTask() {
        saida = new StringBuilder();
        this.tabela = new TabelaDeSimbolos();
    }

    @Override
    public Void visitPrograma(TaskRulesParser.ProgramaContext ctx) {
        saida.append("<!DOCTYPE html>\n"
        +"<html>\n"+
        "<head>\n"
        +"    <meta charset=\"utf-8\">\n"+
        "   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n"+
        "    <title>Cronograma - Lista de Tarefas</title>\n"+
        "    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n"+
            "<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\">\n"+
            "<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css2?family=Marck+Script&family=Pacifico&display=swap\">\n"+
            "<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic\">\n"+
            "<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700\">\n"+
            "<link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\n"+
        "</head>\n"+
        "<body id=\"page-top\">\n"+
            "<nav class=\"navbar navbar-dark navbar-expand-lg fixed-top bg-dark\" id=\"mainNav\">\n"+
                "<div class=\"container\"><a class=\"navbar-brand\" href=\"#page-top\">Cronograma - Lista de Tarefas</a>\n"+
                "</div>\n"+
            "</nav>\n"+
            "<section id=\"portfolio\" class=\"bg-light\">\n"+
                "<div class=\"container\">\n"+
                    "<div class=\"row\">\n"+
                        "<div class=\"col-lg-12 text-center\">\n"+
                            "<h2 class=\"text-uppercase section-heading\">Tarefas</h2>\n"+
                            "<h3 class=\"section-subheading text-muted\">Tarefas ordenadas de acordo com a mais proxima ate a mais distante</h3>\n"+
"                        </div>\n"+
                    "</div>\n"+
                    "<div class=\"row\">\n");
        saida.append("\n");

        //Tarefas na thumb
        //visitTarefas(ctx.tarefa());
        int i=0;
        for(TaskRulesParser.TarefaContext tc : ctx.tarefas().tarefa()){
            
            saida.append(
            "<!-- AQUI TEMOS QUE COLOCAR NO FOR NO PROGRAMA REPETINDO ESSA DIV DE BAIXO -->\n"
            +"<div class=\"col-sm-6 col-md-4 portfolio-item\">\n"
                +"<!-- COLOCAR O HREF REFERENTE COM A PAGINA LA EM BAIXO -->\n"
                +"<a class=\"portfolio-link\" data-toggle=\"modal\" href=\"#");
                
            saida.append("Portfolio"+i);
            saida.append(
                            "\">\n"
                                +"<div class=\"portfolio-hover\">\n"
                                    +"<div class=\"portfolio-hover-content\"><i class=\"fa fa-plus fa-3x\"></i></div>\n"
                                +"</div><img class=\"img-fluid\" src=\"assets/img/portfolio/1-thumbnail.jpg\">\n"
                            +"</a>\n"
                            +"<div class=\"portfolio-caption\">\n"
                                +"<h4>");

            saida.append(tc.nome().getText());
            saida.append("</h4>\n<p class=\"text-muted\">");
            saida.append(tc.categoria().tipo_categoria().getText());       
            saida.append("</p>\n</div>\n</div>");
            i++;
        }

        saida.append("\n");
        saida.append(" </div>\n"
                +"</div>\n"
                +"</section>\n"
                +"<footer>\n"
                    +"<div class=\"container\">\n"
                        +"<div class=\"row\">\n"
                            +"<div class=\"col-md-4\"><span class=\"copyright\">Copyright&nbsp;© Brand 2020</span></div>\n"
                            +"<div class=\"col-md-4\">\n"
                                +"<ul class=\"list-inline social-buttons\">\n"
                                    +"<li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n"
                                    +"<li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n"
                                    +"<li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\n"
                                +"</ul>\n"
                            +"</div>\n"
                            +"<div class=\"col-md-4\">\n"
                                +"<ul class=\"list-inline quicklinks\">\n"
                                    +"<li class=\"list-inline-item\"><a href=\"#\">Política de Privacidade</a></li>\n"
                                    +"<li class=\"list-inline-item\"><a href=\"#\">Termos de uso</a></li>\n"
                                +"</ul>\n"
                            +"</div>\n"
                        +"</div>\n"
                    +"</div>\n"
                +"</footer>\n");

        //APPEND DAS PAGINAS, PARA CADA TASK UMA PAGINA 
        i=0;
        for(TaskRulesParser.TarefaContext tc : ctx.tarefas().tarefa()){
            saida.append("<!-- AQUI TEMOS QUE COLOCAR NO FOR NO PROGRAMA REPETINDO ESSA DIV DE BAIXO -->\n"
            +"<div class=\"modal fade portfolio-modal text-center\" role=\"dialog\" tabindex=\"-1\" id=\"\n");
            
            saida.append("Portfolio"+i);
            saida.append("\">\n"
                +"<div class=\"modal-dialog modal-lg\" role=\"document\">\n"
                    +"<div class=\"modal-content\">\n"
                        +"<div class=\"modal-body\">\n"
                            +"<div class=\"container\">\n"
                                +"<div class=\"row\">\n"
                                    +"<div class=\"col-lg-8 mx-auto\">\n"
                                        +"<div class=\"modal-body\">\n"
                                            +"<!-- Aqui pegar o mesmo nome da Tarefa  -->\n"
                                            +"<h2 class=\"text-uppercase\">");
                                            
            saida.append(tc.nome().getText());                  
            saida.append("</h2>\n"
                            +"<p class=\"item-intro text-muted\">");
                                            
            saida.append(tc.categoria().tipo_categoria().getText());                     
            saida.append(
                            "</p><img"
                                +"class=\"img-fluid d-block mx-auto\" src=\"assets/img/portfolio/1-full.jpg\">\n"
                            +"<p>"); 
                                            
            saida.append(tc.descricao().desc);
            saida.append(                                    
                         "   </p>\n"
                            +"<!-- Aqui em SRC colocamos o link extraido do GOOGLE MAPS DA LOCALIDADE  -->\n"
                            +"<iframe"
                                +"src=\"");
                                                
            saida.append(tc.local().link);
            saida.append(
                         "               \""
                                        +"width=100% height=100% frameborder=\"0\" style=\"border:0;\" allowfullscreen=\"\""
                                        +"aria-hidden=\"false\" tabindex=\"0\"></iframe>\n"
                                    +"<br><br>\n"
                                    +"<button class=\"btn btn-primary\" data-dismiss=\"modal\" type=\"button\"><i"
                                            +"class=\"fa fa-times\"></i><span>&nbsp;Fechar Tarefa</span></button>\n"
                                +"</div>\n</div>\n</div>\n</div>\n</div>\n</div>\n</div>\n</div>\n");
        }


        //Finalizando o HTML
        saida.append("<script src=\"assets/js/jquery.min.js\"></script>\n   "
            +"<script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n"
            +"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js\"></script>\n"
            +"<script src=\"assets/js/agency.js\"></script>\n"
            +"</body>\n"
            +"</html>\n");
            saida.append("\n");
            return null;
    }


    
    @Override
    public Void visitTarefa(TaskRulesParser.TarefaContext ctx) {
        return super.visitTarefa(ctx);
    }
    
    
    @Override
    public Void visitNome(TaskRulesParser.NomeContext ctx) {
        return super.visitNome(ctx);
    }


    @Override
    public Void visitData(TaskRulesParser.DataContext ctx) {
        return super.visitData(ctx);
    }
    
}