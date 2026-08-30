package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q93  reason: default package */
/* loaded from: classes.dex */
public abstract class q93 {
    public int a = -1;
    public int b = -1;
    public String c = null;
    public HashMap d;

    public abstract void a(HashMap hashMap);

    public abstract q93 b();

    public q93 c(q93 q93Var) {
        this.a = q93Var.a;
        this.b = q93Var.b;
        this.c = q93Var.c;
        this.d = q93Var.d;
        return this;
    }

    public abstract void d(HashSet hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap hashMap) {
    }
}
