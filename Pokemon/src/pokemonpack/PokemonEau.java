package pokemonpack;

public class PokemonEau extends Pokemon {

	public PokemonEau(String nm) {
		super(nm, TypePokemon.EAU);
	}

	@Override
	public void attaquer(Pokemon p) {
		switch(p.getType()) {
		case PLANTE:
			log("j'attaque PokéPlante : Eau vs Plante ");
			p.subir(this);
			log("C'est peu efficace....");
			break;
		case FEU:
			log("j'attaque PokéFeu : Eau vs FEU ");
			p.subir(this);
			log("C'est très efficace....");
			break;
		default:			
			break;
		}
		}

	@Override
	public void subir(Pokemon p) {
		switch(p.getType()) {
		case PLANTE:
			this.hp-=(2*p.getAtk());
			break;
		case FEU:
			this.hp-=(0.5*p.getAtk());
			break;
		default:
			this.hp-=p.getAtk();
			break;
		}		
	}

}
