package pokemonpack;

import java.util.Random;

public class Pokemon0 {
	private String nom;
	private int niveau;
	private int hp;
	private int atk;
	
	public Pokemon0(String nm) {
		Random random = new Random();
		this.nom=nm;
        this.niveau = random.nextInt(1,11);
        this.hp=(2*this.niveau);
        this.atk=(this.niveau/2)+1;
         
	}
	public String getNom() {
		return nom;
	}
	public int getNiveau() {
		return niveau;
	} 
	
	public int getAtk() {
		return atk;
	}
	
	public int getHp() {
		return hp;
	}
	
	public boolean isKO() {
		if (hp==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void soigner() {
		this.hp=(this.niveau*2);
	}
	
	public void attaquer(Pokemon p) {
		p.hp-=this.atk;
	}
	
	public String toString() {
		String n;
		n="Nom: " + this.nom + " Niveau : " + this.niveau + " Attaque (atk) : " + this.atk + "Health points (hp) : " + this.hp;
		return n;
	}
	
	public String log(String msg) {
		String s;
		s= "[Pokemon " + this.nom + "]";
		s= s + msg;
		return s;
	}
}