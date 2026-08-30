package m4;

import android.text.Layout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final Layout.Alignment f9213a;

    /* renamed from: b  reason: collision with root package name */
    public static final Layout.Alignment f9214b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (nc.k.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (nc.k.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f9213a = alignment;
        f9214b = alignment2;
    }
}
