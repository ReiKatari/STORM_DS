package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s07  reason: default package */
/* loaded from: classes.dex */
public final class s07 extends k07 {
    public final String b;
    public final int c;
    public final qn2 d;

    public s07(Object obj, String str, int i, qn2 qn2Var) {
        super(obj);
        this.b = str;
        this.c = i;
        this.d = qn2Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.a);
        sb.append(", label=\"");
        sb.append(this.b);
        sb.append("\", leadingIcon=");
        return xg6.q(sb, this.c, ')');
    }
}
