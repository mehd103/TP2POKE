package pokemonpack;

public class PokemonPlante extends Pokemon {

	public PokemonPlante(String nm) {
		super(nm, TypePokemon.PLANTE);
	}

	@Override
	public void attaquer(Pokemon p) {
		switch(p.getType()) {
		case FEU:
			log("j'attaque Pokéfeu : Plante vs Feu ");
			p.subir(this);
			log("C'est peu efficace....");
			break;
		case EAU:
			log("j'attaque PokéEau : Plante vs Eau ");
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
		case FEU:
			this.hp-=(2*p.getAtk());
			break;
		case EAU:
			this.hp-=(0.5*p.getAtk());
			break;
		default:
			this.hp-=p.getAtk();
			break;
		}
		
	}
}
