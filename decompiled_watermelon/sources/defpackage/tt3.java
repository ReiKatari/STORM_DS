package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tt3  reason: default package */
/* loaded from: classes.dex */
public final class tt3 implements m93 {
    public final m93 a;
    public final m93 b;
    public final /* synthetic */ int c;
    public final j06 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tt3(m93 m93Var, m93 m93Var2, int i) {
        this(m93Var, m93Var2, (byte) 0);
        this.c = i;
        m93Var.getClass();
        m93Var2.getClass();
        switch (i) {
            case 1:
                this(m93Var, m93Var2, (byte) 0);
                h06[] h06VarArr = new h06[0];
                if (!zg6.B0("kotlin.Pair")) {
                    ro0 ro0Var = new ro0("kotlin.Pair");
                    ro0.a(ro0Var, "first", m93Var.e());
                    ro0.a(ro0Var, "second", m93Var2.e());
                    this.d = new j06("kotlin.Pair", kh6.h, ro0Var.c.size(), nu.F0(h06VarArr), ro0Var);
                    return;
                }
                i.i("Blank serial names are prohibited");
                throw null;
            default:
                this.d = oo2.t("kotlin.collections.Map.Entry", kh6.j, new h06[0], new gi2(16, m93Var, m93Var2));
                return;
        }
    }

    @Override // defpackage.m93
    public final Object b(b91 b91Var) {
        Object st3Var;
        h06 e = e();
        yu0 c = b91Var.c(e);
        c.getClass();
        Object obj = b53.e;
        Object obj2 = obj;
        Object obj3 = obj2;
        while (true) {
            int v = c.v(e());
            if (v != -1) {
                if (v != 0) {
                    if (v == 1) {
                        obj3 = c.U(e(), 1, this.b, null);
                    } else {
                        throw new IllegalArgumentException(wh1.g(v, "Invalid index: "));
                    }
                } else {
                    obj2 = c.U(e(), 0, this.a, null);
                }
            } else if (obj2 != obj) {
                if (obj3 != obj) {
                    switch (this.c) {
                        case 0:
                            st3Var = new st3(obj2, obj3);
                            break;
                        default:
                            st3Var = new ti4(obj2, obj3);
                            break;
                    }
                    c.a(e);
                    return st3Var;
                }
                throw new IllegalArgumentException("Element 'value' is missing");
            } else {
                throw new IllegalArgumentException("Element 'key' is missing");
            }
        }
    }

    @Override // defpackage.m93
    public final void d(mz1 mz1Var, Object obj) {
        Object key;
        Object value;
        zu0 c = mz1Var.c(e());
        h06 e = e();
        m93 m93Var = this.a;
        int i = this.c;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                key = entry.getKey();
                break;
            default:
                ti4 ti4Var = (ti4) obj;
                ti4Var.getClass();
                key = ti4Var.A;
                break;
        }
        c.F(e, 0, m93Var, key);
        h06 e2 = e();
        m93 m93Var2 = this.b;
        switch (i) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                value = entry2.getValue();
                break;
            default:
                ti4 ti4Var2 = (ti4) obj;
                ti4Var2.getClass();
                value = ti4Var2.B;
                break;
        }
        c.F(e2, 1, m93Var2, value);
        c.a(e());
    }

    @Override // defpackage.m93
    public final h06 e() {
        switch (this.c) {
            case 0:
                return this.d;
            default:
                return this.d;
        }
    }

    public tt3(m93 m93Var, m93 m93Var2, byte b) {
        this.a = m93Var;
        this.b = m93Var2;
    }
}
