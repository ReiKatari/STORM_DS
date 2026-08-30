package androidx.camera.camera2.internal.compat.quirk;

import android.util.Pair;
import j0.k1;
import java.util.HashSet;
import java.util.Locale;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class FlashAvailabilityBufferUnderflowQuirk implements k1 {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet f1039a;

    static {
        HashSet hashSet = new HashSet();
        f1039a = hashSet;
        Locale locale = Locale.US;
        hashSet.add(new Pair("sprd".toLowerCase(locale), "lemp".toLowerCase(locale)));
        hashSet.add(new Pair("sprd".toLowerCase(locale), "DM20C".toLowerCase(locale)));
    }
}
