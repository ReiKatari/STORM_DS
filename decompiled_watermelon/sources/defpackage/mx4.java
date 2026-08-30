package defpackage;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mx4  reason: default package */
/* loaded from: classes.dex */
public final class mx4 {
    public static final lx4 b = new lx4(true, null, null);
    public static final mx4 c = new mx4();
    public final l24 a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l24] */
    public mx4() {
        ?? obj = new Object();
        obj.c = new Object();
        obj.a = 0;
        obj.b = false;
        obj.e = new HashMap();
        obj.f = new CopyOnWriteArraySet();
        obj.d = new AtomicReference(b);
        this.a = obj;
    }
}
