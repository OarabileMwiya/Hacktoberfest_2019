
/**
 * Write a description of class Recipe here.
 *
 * @author ()
 * @version (Final)
 */
public class Recipe
{
    // instance variables -
    private String recipeName;// the name of the recipe
    private String recipeid;//the recipe id
    private String origin;//the place wehere the recipe originates 
    private String category;// which category the recipe is bread or cakes etc
    private String description;//what the recipe is about
    private String ingredients;//what makes up the recipe
    private String instructions;//how to use the recipe to prepare a dish 

    /**
     * Constructor for objects of class Recipe
     * +recipeName 
     * +recipeid
     * +origin
     * +category
     * +category
     * +description
     * +ingredients
     * +instructions
     * 
     */
    public Recipe(String recipeName,String origin, String category, String description ,String ingredients, String instructions )
    {
        this.recipeName=recipeName;
        this.origin=origin;
        this.category=category;
        this.description=description;
        this.ingredients=ingredients;
        this.instructions=instructions;
        this.recipeid=CreateRecipeId(category);
    }

    /**
     * method generates a code for an recipe
     * @param -type of item =>String
     * @return -the randomly generated code=>String
     */
    public String CreateRecipeId(String category){
        return category.substring(0,3) + (int)Math.random()*9999+1;
    }

    /**

    /**
     * mutator methods-assign given attributes to given values
     * @param -new Values
     * @return -void
     */
    public void setRecipeName(String recipeName)
    {
        this.recipeName=recipeName;

    }

    public void SetOrigin(String origin)

    {
        this.origin=origin;
    }

    public void setCategory(String category)
    {
        this.category=category;
    }

    public void setDescription(String description)
    {
        this.description=description;
    }

    public void setIngredients(String ingredients)
    {
        this.ingredients=ingredients;
    }

    public void setInstructions(String instructions)
    {
        this.instructions=instructions;
    }

    /**
     * retriever methods-returns values held by instance variables
     * @param -none
     * @return -type of variable being sought
     */

    public String getRecipeName()
    {
        return this.recipeName;
    }

    public String getOrigin()
    {
        return this.origin;
    }

    public String getCategory()
    {
        return this.category;

    }

    public String getDescription()
    {
        return this.category;
    }

    public String getIngredients()
    {
        return this.ingredients;
    }

    public String getInstructions()
    {
        return this.instructions;
    }

    public String getCreateRecipeId()
    {
        return this.recipeid;
    }

    /**
     * toString()-print format of this item
     * @param none
     * @overides java.lang.Object.toString()
     */

    public String toString()
    {

        return "RecipeName: "+recipeName+"\nRecipeID: "+recipeid+"\nOrigin: "+origin+"\nCategory: "+category+"\nDescription: "+description+
        "\nIngredients: "+ingredients+"\nInstructions: "+instructions;

    }
}
