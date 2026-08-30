package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zo1  reason: default package */
/* loaded from: classes.dex */
public final class zo1 {
    public int a = 1;
    public final yx3 b;
    public yx3 c;
    public yx3 d;
    public int e;
    public int f;

    public zo1(yx3 yx3Var) {
        this.b = yx3Var;
        this.c = yx3Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        wx3 b = this.c.b.b();
        int a = b.a(6);
        if ((a != 0 && ((ByteBuffer) b.R).get(a + b.A) != 0) || this.e == 65039) {
            return true;
        }
        return false;
    }
}
