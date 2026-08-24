package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jg3  reason: default package */
/* loaded from: classes.dex */
public abstract class jg3 {
    public int a = -1;
    public int b = -1;
    public String c = null;
    public HashMap d;

    public abstract void a(HashMap hashMap);

    public abstract jg3 b();

    public jg3 c(jg3 jg3Var) {
        this.a = jg3Var.a;
        this.b = jg3Var.b;
        this.c = jg3Var.c;
        this.d = jg3Var.d;
        return this;
    }

    public abstract void d(HashSet hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap hashMap) {
    }
}
