package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p82  reason: default package */
/* loaded from: classes.dex */
public class p82 extends o82 {
    public final ReentrantLock g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;

    public p82(WindowLayoutComponent windowLayoutComponent, e31 e31Var) {
        super(windowLayoutComponent, e31Var);
        this.g = new ReentrantLock();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
    }

    @Override // defpackage.o82, defpackage.m82, defpackage.gt7
    public final void a(b31 b31Var) {
        LinkedHashMap linkedHashMap = this.h;
        LinkedHashMap linkedHashMap2 = this.i;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(b31Var);
            if (context == null) {
                return;
            }
            i94 i94Var = (i94) linkedHashMap.get(context);
            if (i94Var == null) {
                return;
            }
            ReentrantLock reentrantLock2 = i94Var.b;
            reentrantLock2.lock();
            i94Var.d.remove(b31Var);
            reentrantLock2.unlock();
            linkedHashMap2.remove(b31Var);
            if (i94Var.d.isEmpty()) {
                linkedHashMap.remove(context);
                this.a.removeWindowLayoutInfoListener(i94Var);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.o82, defpackage.m82, defpackage.gt7
    public final void b(Context context, Executor executor, b31 b31Var) {
        LinkedHashMap linkedHashMap = this.h;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            i94 i94Var = (i94) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.i;
            if (i94Var != null) {
                i94Var.a(b31Var);
                linkedHashMap2.put(b31Var, context);
            } else {
                i94 i94Var2 = new i94(context);
                linkedHashMap.put(context, i94Var2);
                linkedHashMap2.put(b31Var, context);
                i94Var2.a(b31Var);
                this.a.addWindowLayoutInfoListener(context, i94Var2);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
