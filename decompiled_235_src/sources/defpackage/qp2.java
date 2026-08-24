package defpackage;

import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qp2  reason: default package */
/* loaded from: classes.dex */
public abstract class qp2 {
    public static final List a = hf.c0(new vr4(new xh5("(?i)^TR\\s+Mother[i:;]?\\s*"), "Мама: "), new vr4(new xh5("(?i)^TR\\s+Mom[i:;]?\\s*"), "Мама: "), new vr4(new xh5("(?i)^TR\\s+"), ""), new vr4(new xh5("(?i)\\bMother[i:;]?\\s*"), "Мама: "), new vr4(new xh5("(?i)\\bMom[i:;]?\\s*"), "Мама: "), new vr4(new xh5("(?i)\\bFather[i:;]?\\s*"), "Папа: "), new vr4(new xh5("(?i)\\bDad[i:;]?\\s*"), "Папа: "), new vr4(new xh5("(?i)\\bBrother[i:;]?\\s*"), "Брат: "), new vr4(new xh5("(?i)\\bSister[i:;]?\\s*"), "Сестра: "), new vr4(new xh5("(?i)\\bGrandpa[i:;]?\\s*"), "Дедушка: "), new vr4(new xh5("(?i)\\bGrandma[i:;]?\\s*"), "Бабушка: "), new vr4(new xh5("(?i)\\bDoctor[i:;]?\\s*"), "Доктор: "), new vr4(new xh5("(?i)\\bProfessor[i:;]?\\s*"), "Профессор: "), new vr4(new xh5("(?i)\\bKing[i:;]?\\s*"), "Король: "), new vr4(new xh5("(?i)\\bQueen[i:;]?\\s*"), "Королева: "), new vr4(new xh5("(?i)\\bPrincess[i:;]?\\s*"), "Принцесса: "), new vr4(new xh5("(?i)\\bMayor[i:;]?\\s*"), "Мэр: "), new vr4(new xh5("(?i)\\bGuard[i:;]?\\s*"), "Стражник: "), new vr4(new xh5("(?i)\\bSoldier[i:;]?\\s*"), "Солдат: "), new vr4(new xh5("(?i)\\bVillager[i:;]?\\s*"), "Житель: "), new vr4(new xh5("(?i)\\bMerchant[i:;]?\\s*"), "Торговец: "), new vr4(new xh5("(?i)\\bShopkeeper[i:;]?\\s*"), "Продавец: "), new vr4(new xh5("(?i)\\bInnkeeper[i:;]?\\s*"), "Трактирщик: "), new vr4(new xh5("(?i)\\bElder[i:;]?\\s*"), "Старейшина: "), new vr4(new xh5("(?i)\\bNarrator[i:;]?\\s*"), "Рассказчик: "), new vr4(new xh5("(?i)\\bCome on,?\\s+sleepyhead!?\\s*It'?s time to get up!?"), "Просыпайся, соня! Пора вставать!"), new vr4(new xh5("(?i)\\bCome on,?\\s+sleepyhead!?"), "Просыпайся, соня!"), new vr4(new xh5("(?i)\\bSleepyhead\\b"), "соня"), new vr4(new xh5("(?i)\\bIt'?s time to get up!?"), "Пора вставать!"), new vr4(new xh5("(?i)\\bНу\\s+или,?\\s+соня!?"), "Просыпайся, соня!"), new vr4(new xh5("(?i)\\bДавай\\s+или\\s+соня!?"), "Просыпайся, соня!"), new vr4(new xh5("(?i)\\bДавай или дурак!?"), "Просыпайся, соня!"), new vr4(new xh5("(?i)\\bДавай\\s+или\\s+дурак\\b"), "Просыпайся, соня"), new vr4(new xh5("(?i)\\bНу\\s+давай,?\\s+соня!?"), "Просыпайся, соня!"), new vr4(new xh5("(?i)\\bДавай,?\\s+соня!?"), "Просыпайся, соня!"), new vr4(new xh5("(?i)\\bWake up!?"), "Просыпайся!"), new vr4(new xh5("(?i)\\bGet up!?"), "Вставай!"), new vr4(new xh5("(?i)\\bNew Game\\b"), "Новая игра"), new vr4(new xh5("(?i)\\bContinue\\b"), "Продолжить"), new vr4(new xh5("(?i)\\bOptions\\b"), "Настройки"), new vr4(new xh5("(?i)\\bSettings\\b"), "Настройки"), new vr4(new xh5("(?i)\\bLoad Game\\b"), "Загрузить игру"), new vr4(new xh5("(?i)\\bSave Game\\b"), "Сохранить игру"), new vr4(new xh5("(?i)\\bGame Over\\b"), "Игра окончена"), new vr4(new xh5("(?i)\\bPress Start\\b"), "Нажмите START"), new vr4(new xh5("(?i)\\bTouch the Touch Screen\\b"), "Коснитесь сенсорного экрана"), new vr4(new xh5("(?i)\\bTouch to Start\\b"), "Коснитесь для начала"), new vr4(new xh5("(?i)\\bTap to Begin\\b"), "Нажмите для старта"), new vr4(new xh5("(?i)\\bPower Button\\b"), "кнопку питания"), new vr4(new xh5("(?i)\\bPower button\\b"), "кнопку питания"), new vr4(new xh5("(?i)\\bOperations Manual\\b"), "Руководство по эксплуатации"), new vr4(new xh5("(?i)\\bOperation Manual\\b"), "Руководство по эксплуатации"), new vr4(new xh5("(?i)\\bTouch Screen\\b"), "Сенсорный экран"), new vr4(new xh5("(?i)\\bUpper Screen\\b"), "Верхний экран"), new vr4(new xh5("(?i)\\bLower Screen\\b"), "Нижний экран"), new vr4(new xh5("(?i)\\bMain Menu\\b"), "Главное меню"), new vr4(new xh5("(?i)\\bSystem Settings\\b"), "Системные настройки"), new vr4(new xh5("(?i)\\bPress and hold\\b"), "Нажмите и удерживайте"), new vr4(new xh5("(?i)\\bPress AND HOLD\\b"), "НАЖМИТЕ И УДЕРЖИВАЙТЕ"), new vr4(new xh5("(?i)\\bInventory\\b"), "Инвентарь"), new vr4(new xh5("(?i)\\bEquipment\\b"), "Снаряжение"), new vr4(new xh5("(?i)\\bStatus\\b"), "Статус"), new vr4(new xh5("(?i)\\bQuest\\b"), "Задание"), new vr4(new xh5("(?i)\\bQuests\\b"), "Задания"), new vr4(new xh5("(?i)\\bAttack\\b"), "Атака"), new vr4(new xh5("(?i)\\bMagic\\b"), "Магия"), new vr4(new xh5("(?i)\\bDefend\\b"), "Защита"), new vr4(new xh5("(?i)\\bItem\\b"), "Предмет"), new vr4(new xh5("(?i)\\bItems\\b"), "Предметы"), new vr4(new xh5("(?i)\\bRun away\\b"), "Сбежать"), new vr4(new xh5("(?i)\\bEscape\\b"), "Побег"), new vr4(new xh5("(?i)\\bLevel Up!?\\b"), "Новый уровень!"), new vr4(new xh5("(?i)\\bExperience\\b"), "Опыт"), new vr4(new xh5("(?i)\\bWhat'?s going on\\??"), "Что происходит?"), new vr4(new xh5("(?i)\\bWhat happened\\??"), "Что случилось?"), new vr4(new xh5("(?i)\\bAre you ready\\??"), "Ты готов?"), new vr4(new xh5("(?i)\\bLet'?s go!?"), "Погнали!"), new vr4(new xh5("(?i)\\bWait a minute!?"), "Минуточку!"), new vr4(new xh5("(?i)\\bHold on!?"), "Погоди-ка!"), new vr4(new xh5("(?i)\\bGood morning!?"), "Доброе утро!"), new vr4(new xh5("(?i)\\bGood night!?"), "Спокойной ночи!"), new vr4(new xh5("(?i)\\bThank you very much!?"), "Большое спасибо!"), new vr4(new xh5("(?i)\\bYou'?re welcome!?"), "Пожалуйста!"), new vr4(new xh5("(?i)\\bSee you later!?"), "Увидимся!"));

    public static String a(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (qs6.v0(str)) {
            return str;
        }
        String obj = qs6.T0(str).toString();
        Pattern compile = Pattern.compile("(?i)^\\[?TR\\]?[:\\s]+\\s*");
        compile.getClass();
        obj.getClass();
        String replaceAll = compile.matcher(obj).replaceAll("");
        replaceAll.getClass();
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (xs6.g0(lowerCase, "ru", false)) {
            String z = lb1.z("^[lI1|!:'\"\\s\\.\\,\\-\\_~>•\\[\\]]+(?=[A-ZА-Яa-zа-я])", replaceAll, "");
            for (vr4 vr4Var : a) {
                xh5 xh5Var = (xh5) vr4Var.A;
                String str3 = (String) vr4Var.B;
                xh5Var.getClass();
                str3.getClass();
                z = xh5Var.A.matcher(z).replaceAll(str3);
                z.getClass();
            }
            return new xh5("(^|[.!?]\\s+)([a-zа-яё])").e(lb1.z("\\s+([.,!?:;…])", z, "$1"), new bz1(17));
        }
        return replaceAll;
    }
}
