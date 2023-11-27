package pokemonpack;
import java.util.Random;


public abstract class Pokemon {
	private String nom;
	private int niveau;
	int hp;
	private int atk;
	private static int niveaumax=10;
	private TypePokemon type;
	
	public Pokemon(String nm, TypePokemon type) {
		Random random = new Random();
		this.nom=nm;
		this.type=type;
        this.niveau = random.nextInt(1,niveaumax);
        this.hp=(2*this.niveau);
        this.atk=(this.niveau/2)+1;
	}
	
	public TypePokemon getType() {
		return this.type;
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
	
	public abstract void attaquer(Pokemon p);
	public abstract void subir(Pokemon p);
	
	public String toString() {
		String n;
		n="Nom: " + this.nom + " Niveau : " + this.niveau + " Attaque (atk) : " + this.atk + "Health points (hp) : " + this.hp + " Type : " + this.type;
		return n;
	}
	
	public String log(String msg) {
		String s;
		s= "[Pokemon " + this.nom + "]";
		s= s + msg;
		return s;
	}
}
