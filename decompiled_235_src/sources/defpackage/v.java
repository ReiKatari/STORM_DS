package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.ParcelFileDescriptor;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b0;
import androidx.fragment.app.c;
import androidx.fragment.app.g;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import com.github.junrar.Archive;
import com.github.junrar.rarfile.FileHeader;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import me.magnum.melonds.impl.emulator.EmulatorMessageQueue;
import me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ v(qf1 qf1Var, yq1 yq1Var, qb0 qb0Var) {
        this.A = 13;
        Map map = Collections.EMPTY_MAP;
        this.B = qf1Var;
        this.L = yq1Var;
        this.R = qb0Var;
    }

    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, p87] */
    @Override // java.lang.Runnable
    public final void run() {
        qx3 l;
        Object obj = null;
        int i = 0;
        boolean z = true;
        switch (this.A) {
            case 0:
                Throwable th = (Throwable) this.B;
                w wVar = (w) this.L;
                List list = (List) this.R;
                if (th != null) {
                    wVar.b.onError(th);
                    return;
                } else {
                    wVar.b.u(list);
                    return;
                }
            case 1:
                hm hmVar = (hm) this.B;
                gm gmVar = (gm) this.R;
                ActionMode startActionMode = hmVar.a.startActionMode(new je2((fm) this.L), 1);
                nb3.k(hmVar.h, startActionMode);
                if (startActionMode == null) {
                    gmVar.close();
                    return;
                }
                return;
            case 2:
                ((Archive) this.B).lambda$getInputStream$0((FileHeader) this.L, (PipedOutputStream) this.R);
                return;
            case 3:
                ((BasePreferenceFragment) this.B).i((RecyclerView) this.L, (String) this.R, 0);
                return;
            case 4:
                ((be0) this.B).b(ae0.b((yk5) this.L), (th) this.R);
                return;
            case 5:
                ((be0) this.B).c(ae0.b((yk5) this.L), (d90) this.R);
                return;
            case 6:
                ArrayList arrayList = (ArrayList) this.B;
                fi4 fi4Var = (fi4) this.L;
                String str = (String) this.R;
                try {
                    int size = arrayList.size();
                    while (true) {
                        if (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            if (nb3.k(((cg0) obj2).d(), str)) {
                                obj = obj2;
                            }
                        }
                    }
                    cg0 cg0Var = (cg0) obj;
                    if (cg0Var != null && (l = cg0Var.l()) != null) {
                        l.e(fi4Var);
                        return;
                    }
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 7:
                String str2 = (String) this.L;
                lw7 lw7Var = (lw7) this.R;
                dx7 w = ((WorkDatabase) this.B).w();
                w.getClass();
                str2.getClass();
                for (String str3 : (List) hv.Q(w.a, true, false, new c70(str2, 23))) {
                    lb4.o(lw7Var, str3);
                }
                return;
            case 8:
                mb0 mb0Var = (mb0) this.L;
                vl5 vl5Var = (vl5) this.R;
                gd1 gd1Var = (gd1) ((yc1) this.B).B;
                if (gd1Var.B.r()) {
                    mb0Var.f(gd1Var, new IOException("Canceled"));
                    return;
                } else {
                    mb0Var.c(gd1Var, vl5Var);
                    return;
                }
            case 9:
                ((mb0) this.R).f((gd1) ((yc1) this.L).B, (Throwable) this.B);
                return;
            case 10:
                ViewGroup viewGroup = (ViewGroup) this.B;
                c cVar = (c) this.R;
                viewGroup.getClass();
                viewGroup.endViewTransition((View) this.L);
                cVar.c.a.c(cVar);
                return;
            case 11:
                o oVar = ((b0) this.B).c;
                o oVar2 = ((b0) this.L).c;
                boolean z2 = ((g) this.R).o;
                bm2 bm2Var = wl2.a;
                oVar.getClass();
                oVar2.getClass();
                if (z2) {
                    oVar2.getEnterTransitionCallback();
                    return;
                } else {
                    oVar.getEnterTransitionCallback();
                    return;
                }
            case 12:
                Runnable runnable = (Runnable) this.L;
                Runnable runnable2 = (Runnable) this.R;
                if (((qf1) this.B).j) {
                    runnable.run();
                    return;
                } else {
                    runnable2.run();
                    return;
                }
            case 13:
                qf1 qf1Var = (qf1) this.B;
                yq1 yq1Var = (yq1) this.L;
                Map map = Collections.EMPTY_MAP;
                qb0 qb0Var = (qb0) this.R;
                try {
                    qf1Var.a.j(yq1Var);
                    qb0Var.a(null);
                    return;
                } catch (RuntimeException e) {
                    qb0Var.c(e);
                    return;
                }
            case 14:
                mq1 mq1Var = (mq1) this.B;
                yq1 yq1Var2 = (yq1) this.L;
                Map map2 = Collections.EMPTY_MAP;
                qb0 qb0Var2 = (qb0) this.R;
                try {
                    mq1Var.a.j(yq1Var2);
                    qb0Var2.a(null);
                    return;
                } catch (RuntimeException e2) {
                    qb0Var2.c(e2);
                    return;
                }
            case 15:
                Runnable runnable3 = (Runnable) this.L;
                Runnable runnable4 = (Runnable) this.R;
                if (((mq1) this.B).f) {
                    runnable3.run();
                    return;
                } else {
                    runnable4.run();
                    return;
                }
            case 16:
                rh rhVar = (rh) this.B;
                hv hvVar = (hv) this.L;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.R;
                try {
                    wi2 W = vy7.W(rhVar.a);
                    if (W != null) {
                        vi2 vi2Var = (vi2) ((vs1) W.b);
                        synchronized (vi2Var.d) {
                            vi2Var.f = threadPoolExecutor;
                        }
                        ((vs1) W.b).a(new ys1(hvVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th2) {
                    hvVar.O(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 17:
                final EmulatorMessageQueue emulatorMessageQueue = (EmulatorMessageQueue) this.B;
                dh5 dh5Var = (dh5) this.L;
                CountDownLatch countDownLatch = (CountDownLatch) this.R;
                try {
                    try {
                        if (!emulatorMessageQueue.f) {
                            Looper myLooper = Looper.myLooper();
                            if (myLooper != null) {
                                int a = EmulatorMessageQueue.a();
                                if (a >= 0) {
                                    ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(a);
                                    if (fromFd != null) {
                                        emulatorMessageQueue.d = fromFd;
                                        emulatorMessageQueue.f = true;
                                        emulatorMessageQueue.e = new FileInputStream(fromFd.getFileDescriptor());
                                        myLooper.getQueue().addOnFileDescriptorEventListener(fromFd.getFileDescriptor(), 1, new MessageQueue.OnFileDescriptorEventListener() { // from class: dx1
                                            @Override // android.os.MessageQueue.OnFileDescriptorEventListener
                                            public final int onFileDescriptorEvents(FileDescriptor fileDescriptor, int i2) {
                                                fileDescriptor.getClass();
                                                EmulatorMessageQueue emulatorMessageQueue2 = EmulatorMessageQueue.this;
                                                if (emulatorMessageQueue2.f) {
                                                    try {
                                                        emulatorMessageQueue2.b();
                                                        return 1;
                                                    } catch (Exception e3) {
                                                        e3.printStackTrace();
                                                        return 1;
                                                    }
                                                }
                                                return 1;
                                            }
                                        });
                                    } else {
                                        throw new RuntimeException("Failed to create ParcelFileDescriptor");
                                    }
                                } else {
                                    throw new RuntimeException("Failed to initialize native pipe");
                                }
                            } else {
                                throw new IllegalStateException("Current thread does not have a Looper");
                            }
                        }
                    } catch (Exception e3) {
                        dh5Var.A = e3;
                    }
                    countDownLatch.countDown();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 18:
                o35 o35Var = (o35) this.B;
                tb0 tb0Var = (tb0) this.L;
                rx7 rx7Var = (rx7) this.R;
                o35Var.getClass();
                try {
                    z = ((Boolean) tb0Var.B.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused2) {
                }
                synchronized (o35Var.k) {
                    try {
                        gw7 a2 = rr7.a(rx7Var.a);
                        String str4 = a2.a;
                        if (o35Var.c(str4) == rx7Var) {
                            o35Var.b(str4);
                        }
                        ga0.f().b(o35.l, o35.class.getSimpleName() + " " + str4 + " executed; reschedule = " + z);
                        ArrayList arrayList2 = o35Var.j;
                        int size2 = arrayList2.size();
                        while (i < size2) {
                            Object obj3 = arrayList2.get(i);
                            i++;
                            ((b72) obj3).b(a2, z);
                        }
                    } finally {
                    }
                }
                return;
            case 19:
                ((m44) this.B).d((qv6) this.L, (Map.Entry) this.R);
                return;
            default:
                jp6 jp6Var = (jp6) this.L;
                final o35 o35Var2 = (o35) ((rr6) this.B).B;
                o35Var2.getClass();
                gw7 gw7Var = jp6Var.a;
                final String str5 = gw7Var.a;
                final ArrayList arrayList3 = new ArrayList();
                yw7 yw7Var = (yw7) o35Var2.e.o(new er2(new Callable() { // from class: n35
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        WorkDatabase workDatabase = o35.this.e;
                        fx7 x = workDatabase.x();
                        x.getClass();
                        String str6 = str5;
                        str6.getClass();
                        arrayList3.addAll((List) hv.Q(x.a, true, false, new cx7(str6, 1)));
                        return workDatabase.w().d(str6);
                    }
                }, 25));
                if (yw7Var == null) {
                    ga0.f().j(o35.l, "Didn't find WorkSpec for id " + gw7Var);
                    o35Var2.d.d.execute(new q64(4, o35Var2, gw7Var));
                    return;
                }
                synchronized (o35Var2.k) {
                    try {
                        synchronized (o35Var2.k) {
                            if (o35Var2.c(str5) != null) {
                                i = 1;
                            }
                        }
                        if (i != 0) {
                            Set set = (Set) o35Var2.h.get(str5);
                            if (((jp6) set.iterator().next()).a.b == gw7Var.b) {
                                set.add(jp6Var);
                                ga0.f().b(o35.l, "Work " + gw7Var + " is already enqueued for processing");
                            } else {
                                o35Var2.d.d.execute(new q64(4, o35Var2, gw7Var));
                            }
                            return;
                        } else if (yw7Var.t != gw7Var.b) {
                            o35Var2.d.d.execute(new q64(4, o35Var2, gw7Var));
                            return;
                        } else {
                            Context context = o35Var2.b;
                            az0 az0Var = o35Var2.c;
                            ow7 ow7Var = o35Var2.d;
                            WorkDatabase workDatabase = o35Var2.e;
                            context.getClass();
                            o35Var2.getClass();
                            ?? obj4 = new Object();
                            obj4.b = az0Var;
                            obj4.c = ow7Var;
                            obj4.d = o35Var2;
                            obj4.e = workDatabase;
                            obj4.f = yw7Var;
                            obj4.g = arrayList3;
                            Context applicationContext = context.getApplicationContext();
                            applicationContext.getClass();
                            obj4.a = applicationContext;
                            new rr6(17);
                            rx7 rx7Var2 = new rx7(obj4);
                            n61 n61Var = rx7Var2.d.b;
                            tc3 c = yh2.c();
                            n61Var.getClass();
                            tb0 B = yh2.B(jw2.y(n61Var, c), new px7(rx7Var2, null, 1));
                            B.B.a(o35Var2.d.d, new v(o35Var2, B, rx7Var2, 18));
                            o35Var2.g.put(str5, rx7Var2);
                            HashSet hashSet = new HashSet();
                            hashSet.add(jp6Var);
                            o35Var2.h.put(str5, hashSet);
                            ga0.f().b(o35.l, o35.class.getSimpleName() + ": processing " + gw7Var);
                            return;
                        }
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ v(yc1 yc1Var, mb0 mb0Var, Throwable th) {
        this.A = 9;
        this.L = yc1Var;
        this.R = mb0Var;
        this.B = th;
    }

    public /* synthetic */ v(be0 be0Var, ae0 ae0Var, yk5 yk5Var, Object obj, int i) {
        this.A = i;
        this.B = be0Var;
        this.L = yk5Var;
        this.R = obj;
    }

    public /* synthetic */ v(mq1 mq1Var, yq1 yq1Var, qb0 qb0Var) {
        this.A = 14;
        Map map = Collections.EMPTY_MAP;
        this.B = mq1Var;
        this.L = yq1Var;
        this.R = qb0Var;
    }

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }
}
