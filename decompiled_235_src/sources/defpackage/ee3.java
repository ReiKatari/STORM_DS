package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ee3  reason: default package */
/* loaded from: classes.dex */
public abstract class ee3 {
    public int a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final ze3 b() {
        if (this instanceof ze3) {
            return (ze3) this;
        }
        e41.y(this, "Not a JSON Object: ");
        return null;
    }

    public String c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            vf3 vf3Var = new vf3(new qy3(sb));
            vf3Var.J(ls6.LENIENT);
            ke3.a.getClass();
            ke3.g(vf3Var, this);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
