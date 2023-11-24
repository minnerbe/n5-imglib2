package net.imglib2.realtransform;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class CoordinateMappingTest {

	@Test
	public void testStackedTransform() {

		final int[] perm = new int[]{1, 0};
		final RealComponentMappingTransform xfm = new RealComponentMappingTransform(3, perm);

		final double[] x = new double[]{7, 5, 3};
		final double[] y = new double[2];

		xfm.apply(x, y);
		System.out.println("x: " + Arrays.toString(x));
		System.out.println("y: " + Arrays.toString(y));
		assertArrayEquals(new double[]{5, 7}, y, 1e-9);

	}

}
