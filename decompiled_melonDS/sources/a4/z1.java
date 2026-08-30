package a4;

import java.util.Comparator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z1 implements Comparator {

    /* renamed from: b  reason: collision with root package name */
    public static final z1 f377b = new z1(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f378a;

    public /* synthetic */ z1(int i2) {
        this.f378a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f378a) {
            case 0:
                o0 o0Var = (o0) obj;
                o0 o0Var2 = (o0) obj2;
                int b10 = nc.k.b(o0Var2.f287k0, o0Var.f287k0);
                if (b10 == 0) {
                    return nc.k.b(o0Var.hashCode(), o0Var2.hashCode());
                }
                return b10;
            default:
                o0 o0Var3 = (o0) obj;
                o0 o0Var4 = (o0) obj2;
                int b11 = nc.k.b(o0Var3.f287k0, o0Var4.f287k0);
                if (b11 == 0) {
                    return nc.k.b(o0Var3.hashCode(), o0Var4.hashCode());
                }
                return b11;
        }
    }
}
