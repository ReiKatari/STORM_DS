package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@n06
/* renamed from: c00  reason: default package */
/* loaded from: classes.dex */
public final class c00 extends f34 {
    public static final b00 Companion = new Object();
    public static final Map p;
    public final pz o;

    /* JADX WARN: Type inference failed for: r0v0, types: [b00, java.lang.Object] */
    static {
        v75 v75Var = q75.a;
        qo0 a = q75.a(pz.class);
        List list = Collections.EMPTY_LIST;
        v75Var.getClass();
        Map singletonMap = Collections.singletonMap(new m07(a), l.b);
        singletonMap.getClass();
        p = singletonMap;
    }

    public c00(int i, pz pzVar) {
        if (1 == (i & 1)) {
            this.o = pzVar;
        } else {
            ep2.H(i, 1, a00.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c00) && b53.x(this.o, ((c00) obj).o)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String toString() {
        return "BackgroundPreview(backgroundParcelable=" + this.o + ")";
    }

    public c00(pz pzVar) {
        this.o = pzVar;
    }
}
