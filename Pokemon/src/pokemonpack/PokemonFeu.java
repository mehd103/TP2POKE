package pokemonpack;

public class PokemonFeu extends Pokemon {

	public PokemonFeu(String nm) {
		super(nm, TypePokemon.FEU);
	}

	@Override
	public void attaquer(Pokemon p) {
		switch(p.getType()) {
		case PLANTE:
			log("j'attaque PokéPlante : Feu vs Plante ");
			p.subir(this);
			log("C'est très efficace....");
			break;
		case EAU:
			log("j'attaque PokéEau : Feu vs Eau ");
			p.subir(this);
			log("C'est peu efficace....");
			break;
		default:			
			break;
		}
	}

	@Override
	public void subir(Pokemon p) {
		switch(p.getType()) {
		case EAU:
			this.hp-=(2*p.getAtk());
			break;
		case PLANTE:
			this.hp-=(0.5*p.getAtk());
			break;
		default:
			this.hp-=p.getAtk();
			break;
		}
		
	}
	

}
