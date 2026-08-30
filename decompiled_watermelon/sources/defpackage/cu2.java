package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cu2  reason: default package */
/* loaded from: classes.dex */
public final class cu2 implements r52 {
    public final il6 a;
    public final il6 b;
    public final boolean c;

    public cu2(il6 il6Var, il6 il6Var2, boolean z) {
        this.a = il6Var;
        this.b = il6Var2;
        this.c = z;
    }

    @Override // defpackage.r52
    public final s52 a(Object obj, df4 df4Var, c55 c55Var) {
        Uri uri = (Uri) obj;
        if (!b53.x(uri.getScheme(), "http") && !b53.x(uri.getScheme(), "https")) {
            return null;
        }
        return new fu2(uri.toString(), df4Var, this.a, this.b, this.c);
    }
}
