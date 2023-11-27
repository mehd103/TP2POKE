package pokemonpack;

public enum TypePokemon {
	EAU("eau"),FEU("feu"),PLANTE("plante");
	
	private String name;
	
	private TypePokemon(String name) {
		this.name=name;
		
	}
	
	@Override
	public String toString() {
		return name;
	}
}
