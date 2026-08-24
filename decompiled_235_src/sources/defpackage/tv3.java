package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tv3  reason: default package */
/* loaded from: classes.dex */
public final class tv3 {
    public StringBuilder d;
    public String e;
    public String f;
    public char g;
    public StringBuilder h;
    public sv3 a = sv3.START_DEFINITION;
    public final StringBuilder b = new StringBuilder();
    public final ArrayList c = new ArrayList();
    public boolean i = false;

    /* JADX WARN: Type inference failed for: r3v0, types: [a21, java.lang.Object, qv3] */
    public final void a() {
        String str;
        if (!this.i) {
            return;
        }
        String a = c62.a(this.f);
        StringBuilder sb = this.h;
        if (sb != null) {
            str = c62.a(sb.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? a21Var = new a21();
        a21Var.g = str2;
        a21Var.h = a;
        a21Var.i = str;
        this.c.add(a21Var);
        this.d = null;
        this.i = false;
        this.e = null;
        this.f = null;
        this.h = null;
    }
}
