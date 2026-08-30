package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t36  reason: default package */
/* loaded from: classes.dex */
public final class t36 extends ic3 implements ki2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ u36 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t36(u36 u36Var, int i) {
        super(0);
        this.B = i;
        this.L = u36Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        Object obj;
        int i = this.B;
        int i2 = 0;
        u36 u36Var = this.L;
        switch (i) {
            case 0:
                boolean z = u36Var.g;
                um umVar = u36Var.f;
                g56 g56Var = u36Var.b;
                if (!z && g56Var.b() && ((Boolean) umVar.d.getValue()).booleanValue()) {
                    List c = u36Var.c();
                    int size = c.size();
                    while (true) {
                        if (i2 < size) {
                            obj = c.get(i2);
                            if (!((w36) obj).d().b()) {
                                i2++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    w36 w36Var = (w36) obj;
                    if (w36Var != null) {
                        y72 y72Var = w36Var.d().f;
                        if (y72Var instanceof sc6) {
                            sc6 sc6Var = (sc6) y72Var;
                            tq5.w(g56Var.B, null, null, new v74(u36Var, new sc6(sc6Var.a, sc6Var.b, new mb4((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L))), null, 16), 3);
                        }
                        u36Var.g = true;
                    }
                }
                return new mb4(((mb4) umVar.d()).a);
            default:
                List b = u36Var.b();
                int size2 = b.size();
                while (i2 < size2) {
                    w36 w36Var2 = (w36) b.get(i2);
                    if (!w36Var2.d().b() || !w36Var2.h()) {
                        i2++;
                    } else {
                        return o27.a;
                    }
                }
                return o27.a;
        }
    }
}
