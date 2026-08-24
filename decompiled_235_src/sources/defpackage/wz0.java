package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wz0  reason: default package */
/* loaded from: classes.dex */
public final class wz0 {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Serializable d;

    public xz0 a() {
        return new xz0(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(rq0... rq0VarArr) {
        if (this.a) {
            ArrayList arrayList = new ArrayList(rq0VarArr.length);
            for (rq0 rq0Var : rq0VarArr) {
                arrayList.add(rq0Var.a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            if (this.a) {
                if (strArr2.length != 0) {
                    this.c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
                    return;
                } else {
                    i.h("At least one cipher suite is required");
                    return;
                }
            }
            i.h("no cipher suites for cleartext connections");
            return;
        }
        i.h("no cipher suites for cleartext connections");
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.String[], java.io.Serializable] */
    public void c(l67... l67VarArr) {
        if (this.a) {
            ArrayList arrayList = new ArrayList(l67VarArr.length);
            for (l67 l67Var : l67VarArr) {
                arrayList.add(l67Var.javaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
            if (this.a) {
                if (strArr2.length != 0) {
                    this.d = (String[]) Arrays.copyOf(strArr2, strArr2.length);
                    return;
                } else {
                    i.h("At least one TLS version is required");
                    return;
                }
            }
            i.h("no TLS versions for cleartext connections");
            return;
        }
        i.h("no TLS versions for cleartext connections");
    }
}
