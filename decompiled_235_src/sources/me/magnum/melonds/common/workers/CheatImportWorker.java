package me.magnum.melonds.common.workers;

import android.app.Notification;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.stormds.emulator.R;
import java.io.InputStream;
import javax.xml.parsers.SAXParserFactory;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class CheatImportWorker extends CoroutineWorker {
    public final hp0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheatImportWorker(Context context, WorkerParameters workerParameters, hp0 hp0Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        hp0Var.getClass();
        this.g = hp0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r12 == r2) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Type inference failed for: r0v6, types: [xo7, java.lang.Object] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(r41 r41Var) {
        ao0 ao0Var;
        int i;
        String b;
        Uri parse;
        Long l;
        Context context = this.a;
        try {
            if (r41Var instanceof ao0) {
                ao0Var = (ao0) r41Var;
                int i2 = ao0Var.Y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ao0Var.Y = i2 - Integer.MIN_VALUE;
                    Object obj = ao0Var.R;
                    Object obj2 = x61.COROUTINE_SUSPENDED;
                    i = ao0Var.Y;
                    String str = null;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                oi2.Y(obj);
                                return obj;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                    } else {
                        oi2.Y(obj);
                        wj2 g = g(null, 0, true);
                        ao0Var.Y = 1;
                        Object m = gi2.m(b(g), ao0Var);
                        if (m != obj2) {
                            m = jg7.a;
                        }
                    }
                    b = this.b.b.b("uri");
                    if (b == null && (parse = Uri.parse(b)) != null) {
                        qi6 g2 = zl1.g(context, parse);
                        if (g2.l()) {
                            AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(parse, "r");
                            if (openAssetFileDescriptor != null) {
                                long length = openAssetFileDescriptor.getLength();
                                if (length == -1) {
                                    l = null;
                                } else {
                                    l = new Long(length);
                                }
                                openAssetFileDescriptor.close();
                            } else {
                                l = null;
                            }
                            String i3 = g2.i();
                            if (i3 != null) {
                                str = qs6.O0('.', i3, i3);
                            }
                            if (nb3.k(str, "xml")) {
                                ?? obj3 = new Object();
                                ao0Var.Y = 2;
                                Object h = h(parse, obj3, l, ao0Var);
                                if (h == obj2) {
                                    return obj2;
                                }
                                return h;
                            }
                            return new jx3();
                        }
                        return new jx3();
                    }
                    return new jx3();
                }
            }
            if (i == 0) {
            }
            b = this.b.b.b("uri");
            if (b == null) {
            }
            return new jx3();
        } catch (Exception unused) {
            return new jx3();
        }
        ao0Var = new ao0(this, (s41) r41Var);
        Object obj4 = ao0Var.R;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = ao0Var.Y;
        String str2 = null;
    }

    public final wj2 g(String str, int i, boolean z) {
        Context context = this.a;
        xg4 xg4Var = new xg4(context, "channel_cheat_importing");
        xg4Var.h = -1;
        xg4Var.k = xg4.b(context.getString(R.string.importing_cheats));
        if (str == null) {
            str = "";
        }
        xg4Var.e = xg4.b(str);
        xg4Var.q = context.getColor(R.color.melonMain);
        xg4Var.t.icon = R.drawable.ic_melon_small;
        xg4Var.l = 100;
        xg4Var.m = i;
        xg4Var.n = z;
        Notification a = xg4Var.a();
        a.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            return new wj2(100, a, 1);
        }
        return new wj2(100, a, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Uri uri, xo7 xo7Var, Long l, s41 s41Var) {
        bo0 bo0Var;
        int i;
        if (s41Var instanceof bo0) {
            bo0Var = (bo0) s41Var;
            int i2 = bo0Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bo0Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = bo0Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = bo0Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    bo0Var.Y = 1;
                    n36 n36Var = new n36(np2.V(bo0Var), x61.UNDECIDED);
                    InputStream openInputStream = this.a.getContentResolver().openInputStream(uri);
                    if (openInputStream != null) {
                        try {
                            g45 g45Var = new g45(openInputStream);
                            eb ebVar = new eb(this, l, g45Var, n36Var, 5);
                            xo7Var.getClass();
                            SAXParserFactory.newInstance().newSAXParser().parse(g45Var, new ey7(new j97(ebVar, 16)));
                            openInputStream.close();
                        } finally {
                        }
                    }
                    obj = n36Var.a();
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                obj.getClass();
                return obj;
            }
        }
        bo0Var = new bo0(this, s41Var);
        Object obj2 = bo0Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = bo0Var.Y;
        if (i == 0) {
        }
        obj2.getClass();
        return obj2;
    }
}
