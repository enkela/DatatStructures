package weiss.util;

/**
 * Instanceless class that contains static methods
 * to manipulate arrays.
 */
public class Arrays
{
    /**
     * Disable construction.
     */
    private Arrays( ) 
    { 
    }
    
    /**
     * Performs a search on sorted array arr.
     * If arr is not sorted, results are undefined.
     * Implicitly, this assumes that all objects are Comparable.
     * @param arr the array to search.
     * @param x the object to search for.
     * @return if x is found, returns the index where it is found;
     *         otherwise, x is not found. In that case, a negative
     *         number is always returned, and this number is equal
     *         to -( p + 1 ), where p is the first position greater
     *         than x. This can range from -1 down to -(arr.length+1).
     * @throws ClassCastException if comparsions cannot be performed.
     */
    public static <AnyType extends Comparable<? super AnyType>> int binarySearch( AnyType [ ] arr, AnyType x )
    {
        return binarySearch( arr, x, new Collections.DefaultComparator<AnyType>( ) );
    }
    
    /**
     * Performs a search on sorted array arr using a comparator.
     * If arr is not sorted, results are undefined.
     * @param arr the array to search.
     * @param x the object to search for.
     * @param cmp the comparator.
     * @return if x is found, returns the index where it is found.
     *         otherwise, x is not found. In that case, a negative
     *         number is always returned, and this number is equal
     *         to -( p + 1 ), which p is the first position greater
     *         than x. This can range from -1 down to -(arr.length+1).
     * @throws ClassCastException if comparsions cannot be performed.
     */
    public static <AnyType> int binarySearch( AnyType [ ] arr, AnyType x, Comparator<? super AnyType> cmp )
    {
        int low = 0;
        int mid = 0;
        int high = arr.length;

        while( low < high )
        {
            mid = ( low + high ) / 2;
            if( cmp.compare( x, arr[ mid ] ) > 0 )
                low = mid + 1;
            else
                high = mid;
        }
        
        if( low == arr.length || cmp.compare( x, arr[ low ] ) != 0 )
            return - ( low + 1 );
        return low;
    }
}
