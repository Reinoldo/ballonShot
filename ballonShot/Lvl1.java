import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl1 extends World
{

    /**
     * Constructor for objects of class Lvl1.
     * 
     */
    public int ciclo=0;
    public Score placar;    
    public PainelHP painel;
    
    public Lvl1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1);
        setPaintOrder(Ballon.class);
        placar = new Score();
       
        painel = new PainelHP();
        addObject(painel, 20, 152);
        
        addObject(placar, 540, 24);
        //Greenfoot.setSpeed(40);
    }

    public void act(){
        
        gerenciarEntradaBalao();   
        gerenciarCiclo();
        
        
    }

    private void gerenciarCiclo(){
        
        
        if (ciclo==1000){
            ciclo = 0;
        }
        ciclo++;
    }
    public void gerenciarEntradaBalao(){

        if (getCiclo()%50==0){
            int x = Greenfoot.getRandomNumber(500) + 50;
            addObject(new Ballon(), x, 430);

        }

    
    }
    public int getCiclo(){
        return ciclo;
    }
    
    public void addScore(int score){
        placar.addScore(score);
    }
    
    public void removeLifeOfScenario(){        
         painel.removeLife();
         
            
    }
}
