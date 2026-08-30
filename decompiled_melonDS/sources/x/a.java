package x;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends Exception {
    public static final Set B = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));
    public final int A;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));
    }

    public a(String str, AssertionError assertionError) {
        super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str), assertionError);
        this.A = 10002;
        if (B.contains(10002)) {
            new CameraAccessException(10002, str, assertionError);
        }
    }

    public a(RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.A = 10001;
        if (B.contains(10001)) {
            new CameraAccessException(10001, null, runtimeException);
        }
    }

    public a(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.A = cameraAccessException.getReason();
    }
}
