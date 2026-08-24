package defpackage;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w65  reason: default package */
/* loaded from: classes.dex */
public final class w65 {
    public static final v65 b = new v65(true, null, null);
    public static final w65 c = new w65();
    public final ra4 a;

    /* JADX WARN: Type inference failed for: r0v0, types: [ra4, java.lang.Object] */
    public w65() {
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
