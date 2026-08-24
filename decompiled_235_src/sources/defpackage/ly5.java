package defpackage;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.magnum.melonds.ui.romlist.RomListActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ly5  reason: default package */
/* loaded from: classes.dex */
public final class ly5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ RomListActivity Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ly5(RomListActivity romListActivity, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = romListActivity;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                ((ly5) q((r41) obj2, (kt) obj)).s(jg7Var);
                return jg7Var;
            default:
                ((ly5) q((r41) obj2, (mm1) obj)).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        RomListActivity romListActivity = this.Z;
        switch (i) {
            case 0:
                ly5 ly5Var = new ly5(romListActivity, r41Var, 0);
                ly5Var.Y = obj;
                return ly5Var;
            default:
                ly5 ly5Var2 = new ly5(romListActivity, r41Var, 1);
                ly5Var2.Y = obj;
                return ly5Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017f  */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object em5Var;
        String string;
        String str;
        e14 e14Var;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        final RomListActivity romListActivity = this.Z;
        Object obj2 = this.Y;
        switch (i) {
            case 0:
                final kt ktVar = (kt) obj2;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                int i2 = ky5.a[ktVar.a.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        int i3 = RomListActivity.K0;
                        zb zbVar = new zb(romListActivity);
                        String string2 = romListActivity.getString(R.string.nightly_update_available);
                        wb wbVar = (wb) zbVar.L;
                        wbVar.d = string2;
                        wbVar.f = romListActivity.getString(R.string.nightly_update_available_message);
                        zbVar.y(R.string.update, new DialogInterface.OnClickListener() { // from class: dy5
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) {
                                int i5 = r3;
                                kt ktVar2 = ktVar;
                                RomListActivity romListActivity2 = romListActivity;
                                switch (i5) {
                                    case 0:
                                        int i6 = RomListActivity.K0;
                                        romListActivity2.D(ktVar2);
                                        return;
                                    default:
                                        int i7 = RomListActivity.K0;
                                        qh7 B = romListActivity2.B();
                                        ktVar2.getClass();
                                        bs2 bs2Var = B.b;
                                        bs2Var.getClass();
                                        SharedPreferences.Editor edit = bs2Var.d.edit();
                                        edit.putString("github_updates_skip_version", ktVar2.d.toString());
                                        edit.apply();
                                        return;
                                }
                            }
                        });
                        zbVar.x(R.string.remind_later_update, new DialogInterface.OnClickListener() { // from class: dy5
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) {
                                int i5 = r3;
                                kt ktVar2 = ktVar;
                                RomListActivity romListActivity2 = romListActivity;
                                switch (i5) {
                                    case 0:
                                        int i6 = RomListActivity.K0;
                                        romListActivity2.D(ktVar2);
                                        return;
                                    default:
                                        int i7 = RomListActivity.K0;
                                        qh7 B = romListActivity2.B();
                                        ktVar2.getClass();
                                        bs2 bs2Var = B.b;
                                        bs2Var.getClass();
                                        SharedPreferences.Editor edit = bs2Var.d.edit();
                                        edit.putString("github_updates_skip_version", ktVar2.d.toString());
                                        edit.apply();
                                        return;
                                }
                            }
                        });
                        zbVar.B();
                        return jg7Var;
                    }
                    i.d();
                } else {
                    int i4 = RomListActivity.K0;
                    Object obj3 = "1.0.0";
                    try {
                        em5Var = romListActivity.getPackageManager().getPackageInfo(romListActivity.getPackageName(), 0).versionName;
                        if (em5Var == null) {
                            em5Var = "1.0.0";
                        }
                    } catch (Throwable th) {
                        em5Var = new em5(th);
                    }
                    if (!(em5Var instanceof em5)) {
                        obj3 = em5Var;
                    }
                    String str2 = (String) obj3;
                    bm7 bm7Var = ktVar.d;
                    int i5 = gy5.b[bm7Var.A.ordinal()];
                    String str3 = "";
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3) {
                                if (i5 == 4) {
                                    string = "";
                                } else if (i5 == 5) {
                                    str = romListActivity.getString(R.string.version_nightly);
                                    str.getClass();
                                    e14Var = romListActivity.B0;
                                    if (e14Var == null) {
                                        String str4 = ktVar.e;
                                        List<b1> list = e14Var.c;
                                        for (b1 b1Var : list) {
                                            b1Var.getClass();
                                        }
                                        eb ebVar = e14Var.a;
                                        if (str4 != null) {
                                            am1 am1Var = new am1((ArrayList) ebVar.B, (q61) ebVar.R, (ArrayList) ebVar.L);
                                            int i6 = 0;
                                            while (true) {
                                                int length = str4.length();
                                                int i7 = i6;
                                                while (true) {
                                                    if (i7 < length) {
                                                        char charAt = str4.charAt(i7);
                                                        if (charAt != '\n' && charAt != '\r') {
                                                            i7++;
                                                        }
                                                    } else {
                                                        i7 = -1;
                                                    }
                                                }
                                                if (i7 != -1) {
                                                    am1Var.i(str4.substring(i6, i7));
                                                    i6 = i7 + 1;
                                                    if (i6 < str4.length() && str4.charAt(i7) == '\r' && str4.charAt(i6) == '\n') {
                                                        i6 = i7 + 2;
                                                    }
                                                } else {
                                                    if (str4.length() > 0 && (i6 == 0 || i6 < str4.length())) {
                                                        am1Var.i(str4.substring(i6));
                                                    }
                                                    am1Var.f(am1Var.n);
                                                    yc1 yc1Var = new yc1(am1Var.k, am1Var.m);
                                                    am1Var.j.getClass();
                                                    v53 v53Var = new v53(yc1Var);
                                                    for (u uVar : am1Var.o) {
                                                        uVar.f(v53Var);
                                                    }
                                                    zy2 zy2Var = (zy2) am1Var.l.b;
                                                    Iterator it = ((ArrayList) ebVar.X).iterator();
                                                    if (!it.hasNext()) {
                                                        for (b1 b1Var2 : list) {
                                                            b1Var2.getClass();
                                                        }
                                                        ap3 ap3Var = e14Var.b;
                                                        eb ebVar2 = new eb((d14) ap3Var.L, new ng3(3), new sn6(), Collections.unmodifiableMap(((ng3) ap3Var.B).A), new xd5(24));
                                                        ebVar2.P(zy2Var);
                                                        for (b1 b1Var3 : list) {
                                                            b1Var3.getClass();
                                                        }
                                                        sn6 sn6Var = (sn6) ebVar2.R;
                                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sn6Var.A);
                                                        Iterator it2 = sn6Var.B.iterator();
                                                        while (it2.hasNext()) {
                                                            pn6 pn6Var = (pn6) it2.next();
                                                            spannableStringBuilder.setSpan(pn6Var.a, pn6Var.b, pn6Var.c, pn6Var.d);
                                                        }
                                                        if (TextUtils.isEmpty(spannableStringBuilder) && !TextUtils.isEmpty(str4)) {
                                                            spannableStringBuilder = new SpannableStringBuilder(str4);
                                                        }
                                                        View inflate = LayoutInflater.from(romListActivity).inflate(R.layout.dialog_styled_update, (ViewGroup) null, false);
                                                        TextView textView = (TextView) inflate.findViewById(R.id.tv_current_version);
                                                        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_new_version);
                                                        TextView textView3 = (TextView) inflate.findViewById(R.id.tv_changelog);
                                                        Button button = (Button) inflate.findViewById(R.id.btn_update_now);
                                                        Button button2 = (Button) inflate.findViewById(R.id.btn_update_later);
                                                        Button button3 = (Button) inflate.findViewById(R.id.btn_skip_version);
                                                        if (textView != null) {
                                                            textView.setText("v".concat(str2));
                                                        }
                                                        if (textView2 != null) {
                                                            textView2.setText("v".concat(str));
                                                        }
                                                        if (textView3 != null) {
                                                            textView3.setText(spannableStringBuilder);
                                                        }
                                                        zb zbVar2 = new zb(romListActivity);
                                                        zbVar2.A(inflate);
                                                        ((wb) zbVar2.L).m = true;
                                                        final ac l = zbVar2.l();
                                                        Window window = l.getWindow();
                                                        if (window != null) {
                                                            window.setBackgroundDrawableResource(17170445);
                                                        }
                                                        if (button != null) {
                                                            button.setOnClickListener(new View.OnClickListener() { // from class: fy5
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    int i8 = r4;
                                                                    kt ktVar2 = ktVar;
                                                                    RomListActivity romListActivity2 = romListActivity;
                                                                    ac acVar = l;
                                                                    switch (i8) {
                                                                        case 0:
                                                                            int i9 = RomListActivity.K0;
                                                                            acVar.dismiss();
                                                                            romListActivity2.D(ktVar2);
                                                                            return;
                                                                        default:
                                                                            int i10 = RomListActivity.K0;
                                                                            acVar.dismiss();
                                                                            qh7 B = romListActivity2.B();
                                                                            ktVar2.getClass();
                                                                            bs2 bs2Var = B.b;
                                                                            bs2Var.getClass();
                                                                            SharedPreferences.Editor edit = bs2Var.d.edit();
                                                                            edit.putString("github_updates_skip_version", ktVar2.d.toString());
                                                                            edit.apply();
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                        }
                                                        if (button2 != null) {
                                                            button2.setOnClickListener(new hr0(l, 5));
                                                        }
                                                        if (button3 != null) {
                                                            button3.setOnClickListener(new View.OnClickListener() { // from class: fy5
                                                                @Override // android.view.View.OnClickListener
                                                                public final void onClick(View view) {
                                                                    int i8 = r4;
                                                                    kt ktVar2 = ktVar;
                                                                    RomListActivity romListActivity2 = romListActivity;
                                                                    ac acVar = l;
                                                                    switch (i8) {
                                                                        case 0:
                                                                            int i9 = RomListActivity.K0;
                                                                            acVar.dismiss();
                                                                            romListActivity2.D(ktVar2);
                                                                            return;
                                                                        default:
                                                                            int i10 = RomListActivity.K0;
                                                                            acVar.dismiss();
                                                                            qh7 B = romListActivity2.B();
                                                                            ktVar2.getClass();
                                                                            bs2 bs2Var = B.b;
                                                                            bs2Var.getClass();
                                                                            SharedPreferences.Editor edit = bs2Var.d.edit();
                                                                            edit.putString("github_updates_skip_version", ktVar2.d.toString());
                                                                            edit.apply();
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                        }
                                                        l.show();
                                                        return jg7Var;
                                                    }
                                                    throw i61.j(it);
                                                }
                                            }
                                        } else {
                                            u34.x("input must not be null");
                                            return null;
                                        }
                                    } else {
                                        nb3.a0("markwon");
                                        throw null;
                                    }
                                } else {
                                    i.d();
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
                    str = string + str3 + bm7Var.B + "." + bm7Var.L + "." + bm7Var.R;
                    e14Var = romListActivity.B0;
                    if (e14Var == null) {
                    }
                }
                return null;
            default:
                mm1 mm1Var = (mm1) obj2;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                ac acVar = romListActivity.F0;
                if (acVar != null) {
                    if (mm1Var instanceof lm1) {
                        View findViewById = acVar.findViewById(R.id.progress_bar_download_progress);
                        findViewById.getClass();
                        ProgressBar progressBar = (ProgressBar) findViewById;
                        View findViewById2 = acVar.findViewById(R.id.text_download_progress);
                        findViewById2.getClass();
                        lm1 lm1Var = (lm1) mm1Var;
                        double d = lm1Var.b;
                        double d2 = lm1Var.a;
                        progressBar.setIndeterminate(false);
                        progressBar.setProgress((int) ((d / d2) * 100.0d));
                        ((TextView) findViewById2).setText(romListActivity.getString(R.string.download_progress_sizes, Double.valueOf((d / 1024.0d) / 1024.0d), Double.valueOf((d2 / 1024.0d) / 1024.0d)));
                        return jg7Var;
                    } else if (mm1Var instanceof jm1) {
                        acVar.dismiss();
                        romListActivity.F0 = null;
                        return jg7Var;
                    } else if (mm1Var instanceof km1) {
                        acVar.dismiss();
                        romListActivity.F0 = null;
                        Toast.makeText(romListActivity, (int) R.string.update_download_failed, 1).show();
                        return jg7Var;
                    } else {
                        i.d();
                        return null;
                    }
                }
                return jg7Var;
        }
    }
}
