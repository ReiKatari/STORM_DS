package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d90  reason: default package */
/* loaded from: classes.dex */
public abstract class d90 implements e93, Serializable {
    public transient e93 A;
    public final Object B;
    public final Class L;
    public final String R;
    public final String X;
    public final boolean Y;

    public d90(Object obj, Class cls, String str, String str2, boolean z) {
        this.B = obj;
        this.L = cls;
        this.R = str;
        this.X = str2;
        this.Y = z;
    }

    public abstract e93 a();

    public final oo0 b() {
        boolean z = this.Y;
        Class cls = this.L;
        if (z) {
            q75.a.getClass();
            return new dh4(cls);
        }
        return q75.a(cls);
    }
}
