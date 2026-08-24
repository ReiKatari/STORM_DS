package defpackage;

import java.nio.ByteBuffer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: it1  reason: default package */
/* loaded from: classes.dex */
public final class it1 {
    public int a = 1;
    public final r54 b;
    public r54 c;
    public r54 d;
    public int e;
    public int f;

    public it1(r54 r54Var) {
        this.b = r54Var;
        this.c = r54Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        p54 b = this.c.b.b();
        int a = b.a(6);
        if ((a != 0 && ((ByteBuffer) b.R).get(a + b.A) != 0) || this.e == 65039) {
            return true;
        }
        return false;
    }
}
