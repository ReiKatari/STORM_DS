package me.magnum.melonds.ui.settings.preferences;

import ah.l;
import ah.m;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.preference.Preference;
import bk.a;
import java.text.NumberFormat;
import java.util.List;
import jb.c;
import k7.w;
import l.d;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.settings.preferences.FirmwareBirthdayPreference;
import vc.h;
import vc.o;
import yb.j;
import zb.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class FirmwareBirthdayPreference extends Preference {
    public static final Object A = v.F(new j(1, 31), new j(2, 29), new j(3, 31), new j(4, 30), new j(5, 31), new j(6, 30), new j(7, 31), new j(8, 31), new j(9, 30), new j(10, 31), new j(11, 30), new j(12, 31));
    public static final NumberFormat B;

    static {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMinimumIntegerDigits(2);
        B = numberInstance;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirmwareBirthdayPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public static int e(int i2, boolean z10, int i10) {
        int i11;
        Integer num = (Integer) A.get(Integer.valueOf(i10));
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = 1;
        }
        if (z10) {
            if (i2 > i11) {
                return 1;
            }
            if (i2 < 1) {
                return i11;
            }
            return i2;
        }
        return p7.j.g(i2, 1, i11);
    }

    public static void f(TextView textView, int i2) {
        textView.setText(B.format(Integer.valueOf(i2)).toString());
    }

    @Override // androidx.preference.Preference
    public final void onClick() {
        int i2;
        super.onClick();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dialog_firmware_birthday, (ViewGroup) null, false);
        int i10 = R.id.buttonBirthdayDayDecrease;
        Button button = (Button) w.k(inflate, R.id.buttonBirthdayDayDecrease);
        if (button != null) {
            i10 = R.id.buttonBirthdayDayIncrease;
            Button button2 = (Button) w.k(inflate, R.id.buttonBirthdayDayIncrease);
            if (button2 != null) {
                i10 = R.id.buttonBirthdayMonthDecrease;
                Button button3 = (Button) w.k(inflate, R.id.buttonBirthdayMonthDecrease);
                if (button3 != null) {
                    i10 = R.id.buttonBirthdayMonthIncrease;
                    Button button4 = (Button) w.k(inflate, R.id.buttonBirthdayMonthIncrease);
                    if (button4 != null) {
                        i10 = R.id.textBirthdayDay;
                        TextView textView = (TextView) w.k(inflate, R.id.textBirthdayDay);
                        if (textView != null) {
                            i10 = R.id.textBirthdayMonth;
                            TextView textView2 = (TextView) w.k(inflate, R.id.textBirthdayMonth);
                            if (textView2 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                final c cVar = new c(constraintLayout, button, button2, button3, button4, textView, textView2);
                                a aVar = new a(getContext());
                                ((d) aVar.L).f8359d = getTitle();
                                aVar.x(constraintLayout);
                                aVar.v(R.string.ok, new l(1, cVar, this));
                                aVar.u(R.string.cancel, new m(3));
                                aVar.y();
                                String persistedString = getPersistedString("01/01");
                                persistedString.getClass();
                                List v02 = h.v0(persistedString, new String[]{"/"});
                                int i11 = 1;
                                if (v02.size() != 2) {
                                    f(textView, 1);
                                    f(textView2, 1);
                                } else {
                                    Integer W = o.W((String) v02.get(0));
                                    if (W != null) {
                                        i2 = W.intValue();
                                    } else {
                                        i2 = 1;
                                    }
                                    f(textView, i2);
                                    Integer W2 = o.W((String) v02.get(1));
                                    if (W2 != null) {
                                        i11 = W2.intValue();
                                    }
                                    f(textView2, i11);
                                }
                                button2.setOnClickListener(new View.OnClickListener(cVar, this, 0) { // from class: fi.c
                                    public final /* synthetic */ int A;
                                    public final /* synthetic */ jb.c B;

                                    {
                                        this.A = r3;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i12;
                                        int i13;
                                        int i14;
                                        int i15;
                                        int i16;
                                        int i17 = this.A;
                                        int i18 = 12;
                                        int i19 = 2;
                                        int i20 = 0;
                                        jb.c cVar2 = this.B;
                                        switch (i17) {
                                            case 0:
                                                Object obj = FirmwareBirthdayPreference.A;
                                                TextView textView3 = (TextView) cVar2.B;
                                                Integer W3 = o.W(textView3.getText().toString());
                                                if (W3 != null) {
                                                    i20 = W3.intValue();
                                                }
                                                Integer W4 = o.W(((TextView) cVar2.L).getText().toString());
                                                if (W4 != null) {
                                                    i12 = W4.intValue();
                                                } else {
                                                    i12 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView3, FirmwareBirthdayPreference.e(i20 + 1, true, i12));
                                                return;
                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                Object obj2 = FirmwareBirthdayPreference.A;
                                                TextView textView4 = (TextView) cVar2.B;
                                                Integer W5 = o.W(textView4.getText().toString());
                                                if (W5 != null) {
                                                    i19 = W5.intValue();
                                                }
                                                Integer W6 = o.W(((TextView) cVar2.L).getText().toString());
                                                if (W6 != null) {
                                                    i13 = W6.intValue();
                                                } else {
                                                    i13 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView4, FirmwareBirthdayPreference.e(i19 - 1, true, i13));
                                                return;
                                            case 2:
                                                Object obj3 = FirmwareBirthdayPreference.A;
                                                TextView textView5 = (TextView) cVar2.B;
                                                TextView textView6 = (TextView) cVar2.L;
                                                Integer W7 = o.W(textView5.getText().toString());
                                                if (W7 != null) {
                                                    i14 = W7.intValue();
                                                } else {
                                                    i14 = 1;
                                                }
                                                Integer W8 = o.W(textView6.getText().toString());
                                                if (W8 != null) {
                                                    i15 = W8.intValue();
                                                } else {
                                                    i15 = 0;
                                                }
                                                int i21 = i15 + 1;
                                                if (i21 >= 1) {
                                                    if (i21 > 12) {
                                                        i18 = 1;
                                                    } else {
                                                        i18 = i21;
                                                    }
                                                }
                                                int e6 = FirmwareBirthdayPreference.e(i14, false, i18);
                                                FirmwareBirthdayPreference.f(textView6, i18);
                                                if (e6 != i14) {
                                                    FirmwareBirthdayPreference.f(textView5, e6);
                                                    return;
                                                }
                                                return;
                                            default:
                                                Object obj4 = FirmwareBirthdayPreference.A;
                                                TextView textView7 = (TextView) cVar2.B;
                                                TextView textView8 = (TextView) cVar2.L;
                                                Integer W9 = o.W(textView7.getText().toString());
                                                if (W9 != null) {
                                                    i16 = W9.intValue();
                                                } else {
                                                    i16 = 1;
                                                }
                                                Integer W10 = o.W(textView8.getText().toString());
                                                if (W10 != null) {
                                                    i19 = W10.intValue();
                                                }
                                                int i22 = i19 - 1;
                                                if (i22 >= 1) {
                                                    if (i22 > 12) {
                                                        i18 = 1;
                                                    } else {
                                                        i18 = i22;
                                                    }
                                                }
                                                int e10 = FirmwareBirthdayPreference.e(i16, false, i18);
                                                FirmwareBirthdayPreference.f(textView8, i18);
                                                if (e10 != i16) {
                                                    FirmwareBirthdayPreference.f(textView7, e10);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                button.setOnClickListener(new View.OnClickListener(cVar, this, 1) { // from class: fi.c
                                    public final /* synthetic */ int A;
                                    public final /* synthetic */ jb.c B;

                                    {
                                        this.A = r3;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i12;
                                        int i13;
                                        int i14;
                                        int i15;
                                        int i16;
                                        int i17 = this.A;
                                        int i18 = 12;
                                        int i19 = 2;
                                        int i20 = 0;
                                        jb.c cVar2 = this.B;
                                        switch (i17) {
                                            case 0:
                                                Object obj = FirmwareBirthdayPreference.A;
                                                TextView textView3 = (TextView) cVar2.B;
                                                Integer W3 = o.W(textView3.getText().toString());
                                                if (W3 != null) {
                                                    i20 = W3.intValue();
                                                }
                                                Integer W4 = o.W(((TextView) cVar2.L).getText().toString());
                                                if (W4 != null) {
                                                    i12 = W4.intValue();
                                                } else {
                                                    i12 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView3, FirmwareBirthdayPreference.e(i20 + 1, true, i12));
                                                return;
                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                Object obj2 = FirmwareBirthdayPreference.A;
                                                TextView textView4 = (TextView) cVar2.B;
                                                Integer W5 = o.W(textView4.getText().toString());
                                                if (W5 != null) {
                                                    i19 = W5.intValue();
                                                }
                                                Integer W6 = o.W(((TextView) cVar2.L).getText().toString());
                                                if (W6 != null) {
                                                    i13 = W6.intValue();
                                                } else {
                                                    i13 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView4, FirmwareBirthdayPreference.e(i19 - 1, true, i13));
                                                return;
                                            case 2:
                                                Object obj3 = FirmwareBirthdayPreference.A;
                                                TextView textView5 = (TextView) cVar2.B;
                                                TextView textView6 = (TextView) cVar2.L;
                                                Integer W7 = o.W(textView5.getText().toString());
                                                if (W7 != null) {
                                                    i14 = W7.intValue();
                                                } else {
                                                    i14 = 1;
                                                }
                                                Integer W8 = o.W(textView6.getText().toString());
                                                if (W8 != null) {
                                                    i15 = W8.intValue();
                                                } else {
                                                    i15 = 0;
                                                }
                                                int i21 = i15 + 1;
                                                if (i21 >= 1) {
                                                    if (i21 > 12) {
                                                        i18 = 1;
                                                    } else {
                                                        i18 = i21;
                                                    }
                                                }
                                                int e6 = FirmwareBirthdayPreference.e(i14, false, i18);
                                                FirmwareBirthdayPreference.f(textView6, i18);
                                                if (e6 != i14) {
                                                    FirmwareBirthdayPreference.f(textView5, e6);
                                                    return;
                                                }
                                                return;
                                            default:
                                                Object obj4 = FirmwareBirthdayPreference.A;
                                                TextView textView7 = (TextView) cVar2.B;
                                                TextView textView8 = (TextView) cVar2.L;
                                                Integer W9 = o.W(textView7.getText().toString());
                                                if (W9 != null) {
                                                    i16 = W9.intValue();
                                                } else {
                                                    i16 = 1;
                                                }
                                                Integer W10 = o.W(textView8.getText().toString());
                                                if (W10 != null) {
                                                    i19 = W10.intValue();
                                                }
                                                int i22 = i19 - 1;
                                                if (i22 >= 1) {
                                                    if (i22 > 12) {
                                                        i18 = 1;
                                                    } else {
                                                        i18 = i22;
                                                    }
                                                }
                                                int e10 = FirmwareBirthdayPreference.e(i16, false, i18);
                                                FirmwareBirthdayPreference.f(textView8, i18);
                                                if (e10 != i16) {
                                                    FirmwareBirthdayPreference.f(textView7, e10);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                button4.setOnClickListener(new View.OnClickListener(cVar, this, 2) { // from class: fi.c
                                    public final /* synthetic */ int A;
                                    public final /* synthetic */ jb.c B;

                                    {
                                        this.A = r3;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i12;
                                        int i13;
                                        int i14;
                                        int i15;
                                        int i16;
                                        int i17 = this.A;
                                        int i18 = 12;
                                        int i19 = 2;
                                        int i20 = 0;
                                        jb.c cVar2 = this.B;
                                        switch (i17) {
                                            case 0:
                                                Object obj = FirmwareBirthdayPreference.A;
                                                TextView textView3 = (TextView) cVar2.B;
                                                Integer W3 = o.W(textView3.getText().toString());
                                                if (W3 != null) {
                                                    i20 = W3.intValue();
                                                }
                                                Integer W4 = o.W(((TextView) cVar2.L).getText().toString());
                                                if (W4 != null) {
                                                    i12 = W4.intValue();
                                                } else {
                                                    i12 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView3, FirmwareBirthdayPreference.e(i20 + 1, true, i12));
                                                return;
                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                Object obj2 = FirmwareBirthdayPreference.A;
                                                TextView textView4 = (TextView) cVar2.B;
                                                Integer W5 = o.W(textView4.getText().toString());
                                                if (W5 != null) {
                                                    i19 = W5.intValue();
                                                }
                                                Integer W6 = o.W(((TextView) cVar2.L).getText().toString());
                                                if (W6 != null) {
                                                    i13 = W6.intValue();
                                                } else {
                                                    i13 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView4, FirmwareBirthdayPreference.e(i19 - 1, true, i13));
                                                return;
                                            case 2:
                                                Object obj3 = FirmwareBirthdayPreference.A;
                                                TextView textView5 = (TextView) cVar2.B;
                                                TextView textView6 = (TextView) cVar2.L;
                                                Integer W7 = o.W(textView5.getText().toString());
                                                if (W7 != null) {
                                                    i14 = W7.intValue();
                                                } else {
                                                    i14 = 1;
                                                }
                                                Integer W8 = o.W(textView6.getText().toString());
                                                if (W8 != null) {
                                                    i15 = W8.intValue();
                                                } else {
                                                    i15 = 0;
                                                }
                                                int i21 = i15 + 1;
                                                if (i21 >= 1) {
                                                    if (i21 > 12) {
                                                        i18 = 1;
                                                    } else {
                                                        i18 = i21;
                                                    }
                                                }
                                                int e6 = FirmwareBirthdayPreference.e(i14, false, i18);
                                                FirmwareBirthdayPreference.f(textView6, i18);
                                                if (e6 != i14) {
                                                    FirmwareBirthdayPreference.f(textView5, e6);
                                                    return;
                                                }
                                                return;
                                            default:
                                                Object obj4 = FirmwareBirthdayPreference.A;
                                                TextView textView7 = (TextView) cVar2.B;
                                                TextView textView8 = (TextView) cVar2.L;
                                                Integer W9 = o.W(textView7.getText().toString());
                                                if (W9 != null) {
                                                    i16 = W9.intValue();
                                                } else {
                                                    i16 = 1;
                                                }
                                                Integer W10 = o.W(textView8.getText().toString());
                                                if (W10 != null) {
                                                    i19 = W10.intValue();
                                                }
                                                int i22 = i19 - 1;
                                                if (i22 >= 1) {
                                                    if (i22 > 12) {
                                                        i18 = 1;
                                                    } else {
                                                        i18 = i22;
                                                    }
                                                }
                                                int e10 = FirmwareBirthdayPreference.e(i16, false, i18);
                                                FirmwareBirthdayPreference.f(textView8, i18);
                                                if (e10 != i16) {
                                                    FirmwareBirthdayPreference.f(textView7, e10);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                button3.setOnClickListener(new View.OnClickListener(cVar, this, 3) { // from class: fi.c
                                    public final /* synthetic */ int A;
                                    public final /* synthetic */ jb.c B;

                                    {
                                        this.A = r3;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i12;
                                        int i13;
                                        int i14;
                                        int i15;
                                        int i16;
                                        int i17 = this.A;
                                        int i18 = 12;
                                        int i19 = 2;
                                        int i20 = 0;
                                        jb.c cVar2 = this.B;
                                        switch (i17) {
                                            case 0:
                                                Object obj = FirmwareBirthdayPreference.A;
                                                TextView textView3 = (TextView) cVar2.B;
                                                Integer W3 = o.W(textView3.getText().toString());
                                                if (W3 != null) {
                                                    i20 = W3.intValue();
                                                }
                                                Integer W4 = o.W(((TextView) cVar2.L).getText().toString());
                                                if (W4 != null) {
                                                    i12 = W4.intValue();
                                                } else {
                                                    i12 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView3, FirmwareBirthdayPreference.e(i20 + 1, true, i12));
                                                return;
                                            case DSiCameraSource.FrontCamera /* 1 */:
                                                Object obj2 = FirmwareBirthdayPreference.A;
                                                TextView textView4 = (TextView) cVar2.B;
                                                Integer W5 = o.W(textView4.getText().toString());
                                                if (W5 != null) {
                                                    i19 = W5.intValue();
                                                }
                                                Integer W6 = o.W(((TextView) cVar2.L).getText().toString());
                                                if (W6 != null) {
                                                    i13 = W6.intValue();
                                                } else {
                                                    i13 = 1;
                                                }
                                                FirmwareBirthdayPreference.f(textView4, FirmwareBirthdayPreference.e(i19 - 1, true, i13));
                                                return;
                                            case 2:
                                                Object obj3 = FirmwareBirthdayPreference.A;
                                                TextView textView5 = (TextView) cVar2.B;
                                                TextView textView6 = (TextView) cVar2.L;
                                                Integer W7 = o.W(textView5.getText().toString());
                                                if (W7 != null) {
                                                    i14 = W7.intValue();
                                                } else {
                                                    i14 = 1;
                                                }
                                                Integer W8 = o.W(textView6.getText().toString());
                                                if (W8 != null) {
                                                    i15 = W8.intValue();
                                                } else {
                                                    i15 = 0;
                                                }
                                                int i21 = i15 + 1;
                                                if (i21 >= 1) {
                                                    if (i21 > 12) {
                                                        i18 = 1;
                                                    } else {
                                                        i18 = i21;
                                                    }
                                                }
                                                int e6 = FirmwareBirthdayPreference.e(i14, false, i18);
                                                FirmwareBirthdayPreference.f(textView6, i18);
                                                if (e6 != i14) {
                                                    FirmwareBirthdayPreference.f(textView5, e6);
                                                    return;
                                                }
                                                return;
                                            default:
                                                Object obj4 = FirmwareBirthdayPreference.A;
                                                TextView textView7 = (TextView) cVar2.B;
                                                TextView textView8 = (TextView) cVar2.L;
                                                Integer W9 = o.W(textView7.getText().toString());
                                                if (W9 != null) {
                                                    i16 = W9.intValue();
                                                } else {
                                                    i16 = 1;
                                                }
                                                Integer W10 = o.W(textView8.getText().toString());
                                                if (W10 != null) {
                                                    i19 = W10.intValue();
                                                }
                                                int i22 = i19 - 1;
                                                if (i22 >= 1) {
                                                    if (i22 > 12) {
                                                        i18 = 1;
                                                    } else {
                                                        i18 = i22;
                                                    }
                                                }
                                                int e10 = FirmwareBirthdayPreference.e(i16, false, i18);
                                                FirmwareBirthdayPreference.f(textView8, i18);
                                                if (e10 != i16) {
                                                    FirmwareBirthdayPreference.f(textView7, e10);
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            }
                        }
                    }
                }
            }
        }
        m9.o.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
