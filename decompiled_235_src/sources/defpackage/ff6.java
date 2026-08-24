package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ff6  reason: default package */
/* loaded from: classes.dex */
public final class ff6 extends aj3 implements on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ gf6 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ff6(gf6 gf6Var, int i) {
        super(0);
        this.B = i;
        this.L = gf6Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        Object obj;
        int i = this.B;
        int i2 = 0;
        gf6 gf6Var = this.L;
        switch (i) {
            case 0:
                boolean z = gf6Var.g;
                gn gnVar = gf6Var.f;
                sg6 sg6Var = gf6Var.b;
                if (!z && sg6Var.a() && ((Boolean) gnVar.d.getValue()).booleanValue()) {
                    List c = gf6Var.c();
                    int size = c.size();
                    while (true) {
                        if (i2 < size) {
                            obj = c.get(i2);
                            if (!((if6) obj).d().b()) {
                                i2++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    if6 if6Var = (if6) obj;
                    if (if6Var != null) {
                        rc2 rc2Var = if6Var.d().f;
                        if (rc2Var instanceof io6) {
                            io6 io6Var = (io6) rc2Var;
                            hv.L(sg6Var.B, null, null, new bf4(gf6Var, new io6(io6Var.a, io6Var.b, new jk4((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L))), null, 16), 3);
                        }
                        gf6Var.g = true;
                    }
                }
                return new jk4(((jk4) gnVar.d()).a);
            default:
                List b = gf6Var.b();
                int size2 = b.size();
                while (i2 < size2) {
                    if6 if6Var2 = (if6) b.get(i2);
                    if (!if6Var2.d().b() || !if6Var2.h()) {
                        i2++;
                    } else {
                        return jg7.a;
                    }
                }
                return jg7.a;
        }
    }
}
