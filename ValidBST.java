public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        long min =  Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        return validate(root.left, min, root.val) && validate(root.right, root.val, max);
    }

    public boolean validate(TreeNode root, long min, long max){
        if(root == null){
            return true;
        }
        if(root.val <= min || root.val >= max){
            return false;
        }

        return validate(root.left, min, root.val) && validate(root.right, root.val, max);
    }
}
