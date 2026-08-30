package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ho6  reason: default package */
/* loaded from: classes.dex */
public final class ho6 extends yn6 {
    public final String b;
    public final int c;
    public final mi2 d;

    public ho6(Object obj, String str, int i, mi2 mi2Var) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = mi2Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return ej6.g(sb, this.c, ')');
    }
}
