package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lb0  reason: default package */
/* loaded from: classes.dex */
public abstract class lb0 implements yf3, Serializable {
    public transient yf3 A;
    public final Object B;
    public final Class L;
    public final String R;
    public final String X;
    public final boolean Y;

    public lb0(Object obj, Class cls, String str, String str2, boolean z) {
        this.B = obj;
        this.L = cls;
        this.R = str;
        this.X = str2;
        this.Y = z;
    }

    public abstract yf3 a();

    public final yq0 b() {
        boolean z = this.Y;
        Class cls = this.L;
        if (z) {
            gh5.a.getClass();
            return new gq4(cls);
        }
        return gh5.a(cls);
    }
}
