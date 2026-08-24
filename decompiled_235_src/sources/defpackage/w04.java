package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w04  reason: default package */
/* loaded from: classes.dex */
public final class w04 implements gg3 {
    public final gg3 a;
    public final gg3 b;
    public final /* synthetic */ int c;
    public final yb6 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w04(gg3 gg3Var, gg3 gg3Var2, int i) {
        this(gg3Var, gg3Var2, (byte) 0);
        this.c = i;
        gg3Var.getClass();
        gg3Var2.getClass();
        switch (i) {
            case 1:
                this(gg3Var, gg3Var2, (byte) 0);
                wb6[] wb6VarArr = new wb6[0];
                if (!qs6.v0("kotlin.Pair")) {
                    br0 br0Var = new br0("kotlin.Pair");
                    br0.a(br0Var, "first", gg3Var.e());
                    br0.a(br0Var, "second", gg3Var2.e());
                    this.d = new yb6("kotlin.Pair", bt6.e, br0Var.c.size(), fv.T0(wb6VarArr), br0Var);
                    return;
                }
                i.h("Blank serial names are prohibited");
                throw null;
            default:
                this.d = mp2.l("kotlin.collections.Map.Entry", bt6.g, new wb6[0], new bi2(21, gg3Var, gg3Var2));
                return;
        }
    }

    @Override // defpackage.gg3
    public final Object c(sc1 sc1Var) {
        Object v04Var;
        wb6 e = e();
        ux0 c = sc1Var.c(e);
        c.getClass();
        Object obj = ge7.j;
        Object obj2 = obj;
        Object obj3 = obj2;
        while (true) {
            int q = c.q(e());
            if (q != -1) {
                if (q != 0) {
                    if (q == 1) {
                        obj3 = c.G(e(), 1, this.b, null);
                    } else {
                        throw new IllegalArgumentException(lb1.g(q, "Invalid index: "));
                    }
                } else {
                    obj2 = c.G(e(), 0, this.a, null);
                }
            } else if (obj2 != obj) {
                if (obj3 != obj) {
                    switch (this.c) {
                        case 0:
                            v04Var = new v04(obj2, obj3);
                            break;
                        default:
                            v04Var = new vr4(obj2, obj3);
                            break;
                    }
                    c.a(e);
                    return v04Var;
                }
                throw new IllegalArgumentException("Element 'value' is missing");
            } else {
                throw new IllegalArgumentException("Element 'key' is missing");
            }
        }
    }

    @Override // defpackage.gg3
    public final void d(x32 x32Var, Object obj) {
        Object key;
        Object value;
        vx0 c = x32Var.c(e());
        wb6 e = e();
        gg3 gg3Var = this.a;
        int i = this.c;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                key = entry.getKey();
                break;
            default:
                vr4 vr4Var = (vr4) obj;
                vr4Var.getClass();
                key = vr4Var.A;
                break;
        }
        c.w(e, 0, gg3Var, key);
        wb6 e2 = e();
        gg3 gg3Var2 = this.b;
        switch (i) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                value = entry2.getValue();
                break;
            default:
                vr4 vr4Var2 = (vr4) obj;
                vr4Var2.getClass();
                value = vr4Var2.B;
                break;
        }
        c.w(e2, 1, gg3Var2, value);
        c.a(e());
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        switch (this.c) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    public w04(gg3 gg3Var, gg3 gg3Var2, byte b) {
        this.a = gg3Var;
        this.b = gg3Var2;
    }
}
