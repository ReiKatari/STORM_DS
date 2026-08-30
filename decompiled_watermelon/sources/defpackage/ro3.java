package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ro3  reason: default package */
/* loaded from: classes.dex */
public final class ro3 {
    public StringBuilder d;
    public String e;
    public String f;
    public char g;
    public StringBuilder h;
    public qo3 a = qo3.START_DEFINITION;
    public final StringBuilder b = new StringBuilder();
    public final ArrayList c = new ArrayList();
    public boolean i = false;

    /* JADX WARN: Type inference failed for: r3v0, types: [oo3, java.lang.Object, vy0] */
    public final void a() {
        String str;
        if (!this.i) {
            return;
        }
        String a = n12.a(this.f);
        StringBuilder sb = this.h;
        if (sb != null) {
            str = n12.a(sb.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? vy0Var = new vy0();
        vy0Var.g = str2;
        vy0Var.h = a;
        vy0Var.i = str;
        this.c.add(vy0Var);
        this.d = null;
        this.i = false;
        this.e = null;
        this.f = null;
        this.h = null;
    }
}
