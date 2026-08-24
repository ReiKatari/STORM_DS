package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = workerParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(ConstraintTrackingWorker constraintTrackingWorker, nx3 nx3Var, ww2 ww2Var, yw7 yw7Var, s41 s41Var) {
        d21 d21Var;
        int i;
        if (s41Var instanceof d21) {
            d21Var = (d21) s41Var;
            int i2 = d21Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d21Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = d21Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = d21Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    hn hnVar = new hn(nx3Var, ww2Var, yw7Var, (r41) null);
                    d21Var.Y = 1;
                    obj = g04.C(hnVar, d21Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                obj.getClass();
                return obj;
            }
        }
        d21Var = new d21(constraintTrackingWorker, s41Var);
        Object obj2 = d21Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = d21Var.Y;
        if (i == 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(ConstraintTrackingWorker constraintTrackingWorker, s41 s41Var) {
        e21 e21Var;
        int i;
        Object obj;
        AtomicInteger atomicInteger;
        nx3 h;
        int i2;
        AtomicInteger atomicInteger2 = constraintTrackingWorker.c;
        WorkerParameters workerParameters = constraintTrackingWorker.g;
        Context context = constraintTrackingWorker.a;
        WorkerParameters workerParameters2 = constraintTrackingWorker.b;
        try {
            if (s41Var instanceof e21) {
                e21Var = (e21) s41Var;
                int i3 = e21Var.Z;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    e21Var.Z = i3 - Integer.MIN_VALUE;
                    e21 e21Var2 = e21Var;
                    Object obj2 = e21Var2.X;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = e21Var2.Z;
                    if (i == 0) {
                        if (i == 1) {
                            h = e21Var2.R;
                            try {
                                oi2.Y(obj2);
                                atomicInteger = atomicInteger2;
                                obj = null;
                            } catch (CancellationException e) {
                                e = e;
                                atomicInteger = atomicInteger2;
                                obj = null;
                                if (atomicInteger.get() == -256) {
                                }
                                if (Build.VERSION.SDK_INT < 31) {
                                }
                                h.c.compareAndSet(-256, i2);
                                if (e instanceof c21) {
                                }
                            }
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj2);
                        String b = workerParameters2.b.b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                        if (b != null && b.length() != 0) {
                            lw7 b2 = lw7.b(context);
                            b2.getClass();
                            dx7 w = b2.c.w();
                            String uuid = workerParameters2.a.toString();
                            uuid.getClass();
                            yw7 d = w.d(uuid);
                            if (d == null) {
                                return new jx3();
                            }
                            w87 w87Var = b2.j;
                            w87Var.getClass();
                            ww2 ww2Var = new ww2(w87Var);
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = ww2Var.b;
                            obj = null;
                            int size = arrayList2.size();
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj3 = arrayList2.get(i4);
                                i4++;
                                AtomicInteger atomicInteger3 = atomicInteger2;
                                if (((k11) obj3).a(d)) {
                                    arrayList.add(obj3);
                                }
                                atomicInteger2 = atomicInteger3;
                            }
                            atomicInteger = atomicInteger2;
                            if (!arrayList.isEmpty()) {
                                ga0.f().b(zv7.a, "Work " + d.a + " constrained by " + gt0.P0(arrayList, null, null, null, new rk7(13), 31));
                            }
                            if (!arrayList.isEmpty()) {
                                String str = i21.a;
                                ga0.f().b(str, "Constraints not met for delegate " + b + ". Requesting retry.");
                                return new Object();
                            }
                            ga0.f().b(i21.a, "Constraints met for delegate ".concat(b));
                            try {
                                is7 is7Var = workerParameters2.f;
                                context.getClass();
                                h = is7Var.h(context, b, workerParameters);
                                ec3 ec3Var = workerParameters.e.d;
                                ec3Var.getClass();
                                try {
                                    n61 F = f04.F(ec3Var);
                                    try {
                                        l5 l5Var = new l5(constraintTrackingWorker, h, ww2Var, d, null, 7);
                                        e21Var2.R = h;
                                        e21Var2.Z = 1;
                                        obj2 = hv.d0(F, l5Var, e21Var2);
                                        if (obj2 == x61Var) {
                                            return x61Var;
                                        }
                                        h = h;
                                    } catch (CancellationException e2) {
                                        e = e2;
                                        h = h;
                                        if (atomicInteger.get() == -256 || (e instanceof c21)) {
                                            if (Build.VERSION.SDK_INT < 31) {
                                                i2 = -512;
                                            } else if (atomicInteger.get() != -256) {
                                                i2 = atomicInteger.get();
                                            } else if (e instanceof c21) {
                                                i2 = ((c21) e).A;
                                            } else {
                                                i.m("Unreachable");
                                                return obj;
                                            }
                                            h.c.compareAndSet(-256, i2);
                                        }
                                        if (e instanceof c21) {
                                            return new Object();
                                        }
                                        throw e;
                                    }
                                } catch (CancellationException e3) {
                                    e = e3;
                                }
                            } catch (Throwable unused) {
                                ga0.f().b(i21.a, "No worker to delegate to.");
                                b2.b.getClass();
                                return new jx3();
                            }
                        } else {
                            ga0.f().d(i21.a, "No worker to delegate to.");
                            return new jx3();
                        }
                    }
                    return (mx3) obj2;
                }
            }
            return (mx3) obj2;
        } catch (CancellationException e4) {
            e = e4;
            if (atomicInteger.get() == -256) {
            }
            if (Build.VERSION.SDK_INT < 31) {
            }
            h.c.compareAndSet(-256, i2);
            if (e instanceof c21) {
            }
        }
        e21Var = new e21(constraintTrackingWorker, s41Var);
        e21 e21Var22 = e21Var;
        Object obj22 = e21Var22.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = e21Var22.Z;
        if (i == 0) {
        }
    }

    @Override // androidx.work.CoroutineWorker
    public final Object e(r41 r41Var) {
        ExecutorService executorService = this.b.c;
        executorService.getClass();
        return hv.d0(f04.F(executorService), new a6(this, null, 12), r41Var);
    }
}
