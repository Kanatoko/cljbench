import java.io.*;
import java.util.*;

public class hoge
{
public static void main( String[] args ) throws Exception
{
List<String> lines = new ArrayList<>();
BufferedReader reader = new BufferedReader( new InputStreamReader( new FileInputStream( "../data.csv" ) ) );
while( true )
{
	String line = reader.readLine();
	if( line == null )
	{
		break;
	}

	lines.add( line );
}

for( int i = 0; i < 10; ++i )
{
	long start = System.currentTimeMillis();
	System.out.println(lines.stream().mapToInt( x -> Integer.parseInt( x.split( "," )[ 0 ] ) ).max() );
	System.out.println( ( System.currentTimeMillis() - start ) + " msecs");
}


}


}
