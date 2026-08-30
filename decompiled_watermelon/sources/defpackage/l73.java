package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l73  reason: default package */
/* loaded from: classes.dex */
public abstract class l73 {
    public int b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final g83 c() {
        if (this instanceof g83) {
            return (g83) this;
        }
        f81.z(this, "Not a JSON Object: ");
        return null;
    }

    public String d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            b93 b93Var = new b93(new nr3(sb));
            b93Var.K(ug6.LENIENT);
            r73.a.getClass();
            r73.g(b93Var, this);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
