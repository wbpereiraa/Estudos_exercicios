
#|Criar um cadastro de usuário e colocar em um banco de dados para salvar o histórico de vendas de cada cliente para posterior análise de dados de valor gasto mensal, forma de pagamento e periocidade de compra!

lista = []
tot_gasto = 0
while True:
    produto = str(input('Digite o nome do produto: '))
    lista.append(produto)
    preço = float(input('Digite o preço do produto: R$'))
    tot_gasto += preço
    lista.append(preço)
    resp = ' '
    while resp not in 'SN':
        resp = str(input('Deseja adicionar outro produto? [S/N] ')).upper().strip()[0]
    if resp == 'N':
        break
print(' ')
print('-' * 40)
print(f'{"Listagem de Compras":^40}')
print('-' * 40)
for pos in range (0, len(lista)):
    if pos % 2 == 0:
        print(f'{lista[pos]:.<30}', end= ' ')
    else:
        print(f'R${lista[pos]:>7.2f}')
print('-' * 40)
print(' ')
print(f'O Total gasto em sua compra foi de R${tot_gasto}.')
print(' ')
desc_2 = tot_gasto * 0.02
desc_5 = tot_gasto * 0.05
desc_3 = tot_gasto * 0.03
acres_10 = tot_gasto * 0.10

print('''FORMAS DE PAGAMENTO:
[ 1 ] Á vista no dinheiro/Pix
[ 2 ] Á vista no cartão
[ 3 ] Em 3x no cartão
[ 4 ] Em 4x ou mais''')
print(' ')
while True:
    opcao = int(input('Digite a opção desejada: '))
    if opcao == 1:
        print(' ')
        print(f'O valor total de sua compra é de R${tot_gasto}. O valor a ser pago é de R${tot_gasto - desc_5}. Você teve 5% de desconto!')
        break
    if opcao == 2:
        print(' ')
        print(f'O valor total da sua compra foi de R${tot_gasto}. O valor a ser pago é de R${tot_gasto - desc_3}. Você teve 3% de desconto!')
        break
    if opcao == 3:
        print(' ')
        print(f'O valor total da sua compra foi de R${tot_gasto}. O valor a ser pago é de R${tot_gasto - (desc_2)}. Você teve 2% de desconto! - Valor da Parcela = R${(tot_gasto - desc_2) / 3:.2f}.')
        break
    if opcao == 4:
        print(' ')
        qts_parcelas = int(input('Em quantas parcelas deseja efetuar a compra? '))
        if qts_parcelas > 10:
            print(' ')
            print(f'O valor total da sua compra foi de R${tot_gasto}. O valor a ser pago é de R${tot_gasto + (acres_10)}. Você teve um acréscimo de 10% em sua compra! - Valor da Parcela = R${(tot_gasto + acres_10) / qts_parcelas:.2f}.')
            break
        else:
            print('-' * 50)
            print(f'O valor total da sua compra foi de R${tot_gasto}. O valor a ser pago é de R${tot_gasto}. Você não teve desconto! - Valor da Parcela = R${tot_gasto / qts_parcelas}.')
            break
    else:
        print(' ')
        print('Opção Inválida!')
        resp = ' '
        while resp not in 'SN':
            resp = str(input('Deseja tentar novamente ou verificar outra forma de pagamento? [S/N] ')).upper().strip()[0]
        if resp == 'N':
            print(' ')
            print('Programa encerrado.')
            break
        print(' ')
        print('''FORMAS DE PAGAMENTO:
    [ 1 ] Á vista no dinheiro/Pix
    [ 2 ] Á vista no cartão
    [ 3 ] Em 3x no cartão
    [ 4 ] Em 4x ou mais''')