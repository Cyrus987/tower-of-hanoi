
public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
{
    this.model = model;
    // Call the recursive solve method to start solving the Tower of Hanoi
    solve(model.height(), 0, 2, 1);  // Tower 0 is the source, Tower 2 is the destination, Tower 1 is auxiliary
}

// Overloaded recursive solve method
private void solve(int n, int source, int destination, int auxiliary)
{
    // Base case: If there's only one disk, move it directly from source to destination
    if (n == 1) {
        model.move(source, destination); // Move the disk
        return;
    }

    // Step 1: Move top n-1 disks from source to auxiliary using destination as auxiliary
    solve(n - 1, source, auxiliary, destination);

    // Step 2: Move the nth disk (largest disk) from source to destination
    model.move(source, destination);

    // Step 3: Move the n-1 disks from auxiliary to destination using source as auxiliary
    solve(n - 1, auxiliary, destination, source);
}
    

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    // [ solve method here]
    //

}
