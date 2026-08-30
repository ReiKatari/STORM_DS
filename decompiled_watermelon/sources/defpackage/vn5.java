package defpackage;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vn5  reason: default package */
/* loaded from: classes.dex */
public final class vn5 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ RomListActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vn5(RomListActivity romListActivity, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = romListActivity;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                ((vn5) t((j11) obj2, (us) obj)).v(o27Var);
                return o27Var;
            default:
                ((vn5) t((j11) obj2, (hi1) obj)).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        RomListActivity romListActivity = this.Z;
        switch (i) {
            case 0:
                vn5 vn5Var = new vn5(romListActivity, j11Var, 0);
                vn5Var.Y = obj;
                return vn5Var;
            default:
                vn5 vn5Var2 = new vn5(romListActivity, j11Var, 1);
                vn5Var2.Y = obj;
                return vn5Var2;
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        String string;
        String str;
        int i = this.X;
        o27 o27Var = o27.a;
        final RomListActivity romListActivity = this.Z;
        int i2 = 0;
        Object obj2 = this.Y;
        switch (i) {
            case 0:
                final us usVar = (us) obj2;
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                int i3 = un5.a[usVar.a.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = RomListActivity.J0;
                        sb sbVar = new sb(romListActivity);
                        String string2 = romListActivity.getString(R.string.nightly_update_available);
                        pb pbVar = (pb) sbVar.L;
                        pbVar.d = string2;
                        pbVar.f = romListActivity.getString(R.string.nightly_update_available_message);
                        sbVar.z(R.string.update, new DialogInterface.OnClickListener() { // from class: on5
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                int i6 = r3;
                                us usVar2 = usVar;
                                RomListActivity romListActivity2 = romListActivity;
                                switch (i6) {
                                    case 0:
                                        int i7 = RomListActivity.J0;
                                        romListActivity2.D(usVar2);
                                        return;
                                    case 1:
                                        int i8 = RomListActivity.J0;
                                        v37 B = romListActivity2.B();
                                        usVar2.getClass();
                                        wl2 wl2Var = B.b;
                                        wl2Var.getClass();
                                        SharedPreferences.Editor edit = wl2Var.d.edit();
                                        edit.putString("github_updates_skip_version", usVar2.d.toString());
                                        edit.apply();
                                        return;
                                    case 2:
                                        int i9 = RomListActivity.J0;
                                        romListActivity2.D(usVar2);
                                        return;
                                    default:
                                        int i10 = RomListActivity.J0;
                                        v37 B2 = romListActivity2.B();
                                        usVar2.getClass();
                                        wl2 wl2Var2 = B2.b;
                                        wl2Var2.getClass();
                                        SharedPreferences.Editor edit2 = wl2Var2.d.edit();
                                        edit2.putString("github_updates_skip_version", usVar2.d.toString());
                                        edit2.apply();
                                        return;
                                }
                            }
                        });
                        sbVar.x(R.string.remind_later_update, new DialogInterface.OnClickListener() { // from class: on5
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                int i6 = r3;
                                us usVar2 = usVar;
                                RomListActivity romListActivity2 = romListActivity;
                                switch (i6) {
                                    case 0:
                                        int i7 = RomListActivity.J0;
                                        romListActivity2.D(usVar2);
                                        return;
                                    case 1:
                                        int i8 = RomListActivity.J0;
                                        v37 B = romListActivity2.B();
                                        usVar2.getClass();
                                        wl2 wl2Var = B.b;
                                        wl2Var.getClass();
                                        SharedPreferences.Editor edit = wl2Var.d.edit();
                                        edit.putString("github_updates_skip_version", usVar2.d.toString());
                                        edit.apply();
                                        return;
                                    case 2:
                                        int i9 = RomListActivity.J0;
                                        romListActivity2.D(usVar2);
                                        return;
                                    default:
                                        int i10 = RomListActivity.J0;
                                        v37 B2 = romListActivity2.B();
                                        usVar2.getClass();
                                        wl2 wl2Var2 = B2.b;
                                        wl2Var2.getClass();
                                        SharedPreferences.Editor edit2 = wl2Var2.d.edit();
                                        edit2.putString("github_updates_skip_version", usVar2.d.toString());
                                        edit2.apply();
                                        return;
                                }
                            }
                        });
                        sbVar.C();
                        return o27Var;
                    }
                    i.c();
                    return null;
                }
                bu3 bu3Var = romListActivity.A0;
                if (bu3Var != null) {
                    String str2 = usVar.e;
                    List<a1> list = bu3Var.c;
                    for (a1 a1Var : list) {
                        a1Var.getClass();
                    }
                    q9 q9Var = bu3Var.a;
                    if (str2 != null) {
                        vh1 vh1Var = new vh1((ArrayList) q9Var.B, (jo1) q9Var.R, (ArrayList) q9Var.L);
                        while (true) {
                            int length = str2.length();
                            int i5 = i2;
                            while (true) {
                                if (i5 < length) {
                                    char charAt = str2.charAt(i5);
                                    if (charAt != '\n' && charAt != '\r') {
                                        i5++;
                                    }
                                } else {
                                    i5 = -1;
                                }
                            }
                            if (i5 != -1) {
                                vh1Var.i(str2.substring(i2, i5));
                                i2 = i5 + 1;
                                if (i2 < str2.length() && str2.charAt(i5) == '\r' && str2.charAt(i2) == '\n') {
                                    i2 = i5 + 2;
                                }
                            } else {
                                if (str2.length() > 0 && (i2 == 0 || i2 < str2.length())) {
                                    vh1Var.i(str2.substring(i2));
                                }
                                vh1Var.f(vh1Var.n);
                                k91 k91Var = new k91(vh1Var.k, vh1Var.m);
                                vh1Var.j.getClass();
                                sz2 sz2Var = new sz2(k91Var);
                                for (t tVar : vh1Var.o) {
                                    tVar.f(sz2Var);
                                }
                                ys2 ys2Var = (ys2) vh1Var.l.b;
                                Iterator it = ((ArrayList) q9Var.X).iterator();
                                if (!it.hasNext()) {
                                    for (a1 a1Var2 : list) {
                                        a1Var2.getClass();
                                    }
                                    ci3 ci3Var = bu3Var.b;
                                    q9 q9Var2 = new q9((au3) ci3Var.L, new u93(3), new cc6(), Collections.unmodifiableMap(((u93) ci3Var.B).a), new iq0(23));
                                    q9Var2.O(ys2Var);
                                    for (a1 a1Var3 : list) {
                                        a1Var3.getClass();
                                    }
                                    cc6 cc6Var = (cc6) q9Var2.R;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cc6Var.A);
                                    Iterator it2 = cc6Var.B.iterator();
                                    while (it2.hasNext()) {
                                        zb6 zb6Var = (zb6) it2.next();
                                        spannableStringBuilder.setSpan(zb6Var.a, zb6Var.b, zb6Var.c, zb6Var.d);
                                    }
                                    if (TextUtils.isEmpty(spannableStringBuilder) && !TextUtils.isEmpty(str2)) {
                                        spannableStringBuilder = new SpannableStringBuilder(str2);
                                    }
                                    sb sbVar2 = new sb(romListActivity);
                                    c87 c87Var = usVar.d;
                                    int i6 = qn5.b[c87Var.A.ordinal()];
                                    String str3 = "";
                                    if (i6 != 1) {
                                        if (i6 != 2) {
                                            if (i6 != 3) {
                                                if (i6 == 4) {
                                                    string = "";
                                                } else if (i6 == 5) {
                                                    str = romListActivity.getString(R.string.version_nightly);
                                                    str.getClass();
                                                    String string3 = romListActivity.getString(R.string.update_available, str);
                                                    pb pbVar2 = (pb) sbVar2.L;
                                                    pbVar2.d = string3;
                                                    pbVar2.f = spannableStringBuilder;
                                                    sbVar2.z(R.string.update, new DialogInterface.OnClickListener() { // from class: on5
                                                        @Override // android.content.DialogInterface.OnClickListener
                                                        public final void onClick(DialogInterface dialogInterface, int i52) {
                                                            int i62 = r3;
                                                            us usVar2 = usVar;
                                                            RomListActivity romListActivity2 = romListActivity;
                                                            switch (i62) {
                                                                case 0:
                                                                    int i7 = RomListActivity.J0;
                                                                    romListActivity2.D(usVar2);
                                                                    return;
                                                                case 1:
                                                                    int i8 = RomListActivity.J0;
                                                                    v37 B = romListActivity2.B();
                                                                    usVar2.getClass();
                                                                    wl2 wl2Var = B.b;
                                                                    wl2Var.getClass();
                                                                    SharedPreferences.Editor edit = wl2Var.d.edit();
                                                                    edit.putString("github_updates_skip_version", usVar2.d.toString());
                                                                    edit.apply();
                                                                    return;
                                                                case 2:
                                                                    int i9 = RomListActivity.J0;
                                                                    romListActivity2.D(usVar2);
                                                                    return;
                                                                default:
                                                                    int i10 = RomListActivity.J0;
                                                                    v37 B2 = romListActivity2.B();
                                                                    usVar2.getClass();
                                                                    wl2 wl2Var2 = B2.b;
                                                                    wl2Var2.getClass();
                                                                    SharedPreferences.Editor edit2 = wl2Var2.d.edit();
                                                                    edit2.putString("github_updates_skip_version", usVar2.d.toString());
                                                                    edit2.apply();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    sbVar2.x(R.string.cancel, null);
                                                    sbVar2.y(R.string.skip_update, new DialogInterface.OnClickListener() { // from class: on5
                                                        @Override // android.content.DialogInterface.OnClickListener
                                                        public final void onClick(DialogInterface dialogInterface, int i52) {
                                                            int i62 = r3;
                                                            us usVar2 = usVar;
                                                            RomListActivity romListActivity2 = romListActivity;
                                                            switch (i62) {
                                                                case 0:
                                                                    int i7 = RomListActivity.J0;
                                                                    romListActivity2.D(usVar2);
                                                                    return;
                                                                case 1:
                                                                    int i8 = RomListActivity.J0;
                                                                    v37 B = romListActivity2.B();
                                                                    usVar2.getClass();
                                                                    wl2 wl2Var = B.b;
                                                                    wl2Var.getClass();
                                                                    SharedPreferences.Editor edit = wl2Var.d.edit();
                                                                    edit.putString("github_updates_skip_version", usVar2.d.toString());
                                                                    edit.apply();
                                                                    return;
                                                                case 2:
                                                                    int i9 = RomListActivity.J0;
                                                                    romListActivity2.D(usVar2);
                                                                    return;
                                                                default:
                                                                    int i10 = RomListActivity.J0;
                                                                    v37 B2 = romListActivity2.B();
                                                                    usVar2.getClass();
                                                                    wl2 wl2Var2 = B2.b;
                                                                    wl2Var2.getClass();
                                                                    SharedPreferences.Editor edit2 = wl2Var2.d.edit();
                                                                    edit2.putString("github_updates_skip_version", usVar2.d.toString());
                                                                    edit2.apply();
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    sbVar2.C();
                                                    return o27Var;
                                                } else {
                                                    i.c();
                                                }
                                            } else {
                                                string = romListActivity.getString(R.string.version_rc);
                                            }
                                        } else {
                                            string = romListActivity.getString(R.string.version_beta);
                                        }
                                    } else {
                                        string = romListActivity.getString(R.string.version_alpha);
                                    }
                                    string.getClass();
                                    if (string.length() != 0) {
                                        str3 = " ";
                                    }
                                    str = string + str3 + c87Var.B + "." + c87Var.L + "." + c87Var.R;
                                    String string32 = romListActivity.getString(R.string.update_available, str);
                                    pb pbVar22 = (pb) sbVar2.L;
                                    pbVar22.d = string32;
                                    pbVar22.f = spannableStringBuilder;
                                    sbVar2.z(R.string.update, new DialogInterface.OnClickListener() { // from class: on5
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i52) {
                                            int i62 = r3;
                                            us usVar2 = usVar;
                                            RomListActivity romListActivity2 = romListActivity;
                                            switch (i62) {
                                                case 0:
                                                    int i7 = RomListActivity.J0;
                                                    romListActivity2.D(usVar2);
                                                    return;
                                                case 1:
                                                    int i8 = RomListActivity.J0;
                                                    v37 B = romListActivity2.B();
                                                    usVar2.getClass();
                                                    wl2 wl2Var = B.b;
                                                    wl2Var.getClass();
                                                    SharedPreferences.Editor edit = wl2Var.d.edit();
                                                    edit.putString("github_updates_skip_version", usVar2.d.toString());
                                                    edit.apply();
                                                    return;
                                                case 2:
                                                    int i9 = RomListActivity.J0;
                                                    romListActivity2.D(usVar2);
                                                    return;
                                                default:
                                                    int i10 = RomListActivity.J0;
                                                    v37 B2 = romListActivity2.B();
                                                    usVar2.getClass();
                                                    wl2 wl2Var2 = B2.b;
                                                    wl2Var2.getClass();
                                                    SharedPreferences.Editor edit2 = wl2Var2.d.edit();
                                                    edit2.putString("github_updates_skip_version", usVar2.d.toString());
                                                    edit2.apply();
                                                    return;
                                            }
                                        }
                                    });
                                    sbVar2.x(R.string.cancel, null);
                                    sbVar2.y(R.string.skip_update, new DialogInterface.OnClickListener() { // from class: on5
                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final void onClick(DialogInterface dialogInterface, int i52) {
                                            int i62 = r3;
                                            us usVar2 = usVar;
                                            RomListActivity romListActivity2 = romListActivity;
                                            switch (i62) {
                                                case 0:
                                                    int i7 = RomListActivity.J0;
                                                    romListActivity2.D(usVar2);
                                                    return;
                                                case 1:
                                                    int i8 = RomListActivity.J0;
                                                    v37 B = romListActivity2.B();
                                                    usVar2.getClass();
                                                    wl2 wl2Var = B.b;
                                                    wl2Var.getClass();
                                                    SharedPreferences.Editor edit = wl2Var.d.edit();
                                                    edit.putString("github_updates_skip_version", usVar2.d.toString());
                                                    edit.apply();
                                                    return;
                                                case 2:
                                                    int i9 = RomListActivity.J0;
                                                    romListActivity2.D(usVar2);
                                                    return;
                                                default:
                                                    int i10 = RomListActivity.J0;
                                                    v37 B2 = romListActivity2.B();
                                                    usVar2.getClass();
                                                    wl2 wl2Var2 = B2.b;
                                                    wl2Var2.getClass();
                                                    SharedPreferences.Editor edit2 = wl2Var2.d.edit();
                                                    edit2.putString("github_updates_skip_version", usVar2.d.toString());
                                                    edit2.apply();
                                                    return;
                                            }
                                        }
                                    });
                                    sbVar2.C();
                                    return o27Var;
                                }
                                throw b31.m(it);
                            }
                        }
                    } else {
                        c44.i("input must not be null");
                    }
                    return null;
                }
                b53.g0("markwon");
                throw null;
            default:
                hi1 hi1Var = (hi1) obj2;
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                tb tbVar = romListActivity.E0;
                if (tbVar != null) {
                    if (hi1Var instanceof gi1) {
                        View findViewById = tbVar.findViewById(R.id.progress_bar_download_progress);
                        findViewById.getClass();
                        ProgressBar progressBar = (ProgressBar) findViewById;
                        View findViewById2 = tbVar.findViewById(R.id.text_download_progress);
                        findViewById2.getClass();
                        gi1 gi1Var = (gi1) hi1Var;
                        double d = gi1Var.b;
                        double d2 = gi1Var.a;
                        progressBar.setIndeterminate(false);
                        progressBar.setProgress((int) ((d / d2) * 100.0d));
                        ((TextView) findViewById2).setText(romListActivity.getString(R.string.download_progress_sizes, Double.valueOf((d / 1024.0d) / 1024.0d), Double.valueOf((d2 / 1024.0d) / 1024.0d)));
                        return o27Var;
                    } else if (hi1Var instanceof ei1) {
                        tbVar.dismiss();
                        romListActivity.E0 = null;
                        return o27Var;
                    } else if (hi1Var instanceof fi1) {
                        tbVar.dismiss();
                        romListActivity.E0 = null;
                        Toast.makeText(romListActivity, (int) R.string.update_download_failed, 1).show();
                        return o27Var;
                    } else {
                        i.c();
                        return null;
                    }
                }
                return o27Var;
        }
    }
}
